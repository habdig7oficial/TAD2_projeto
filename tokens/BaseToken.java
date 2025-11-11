package tokens;

public abstract class BaseToken{
    private String name;

    private short argsMin;
    private short argsMax;

    BaseToken(String name, short argsMin, short argsMax){
        this.name = name;
        this.argsMin = argsMin;
        this.argsMax = argsMax;
    }

    public String getName() {
        return name;
    }

    public void call(String ...args) throws Exception{
        if(args.length < argsMin || args.length > argsMax)
            throw new RuntimeException(String.format("Expect BETWEEN %d and %d\nBut %d was given", argsMin, argsMax, args.length));
    }

    abstract void callMethod(String ...args);

    @Override
    public boolean equals(Object obj) {
        //System.out.printf("%s - %s\n", obj, this.name);
        if (obj == this) {
            return true;
        }
        else if (this.name.equals((String) obj)) {
            return true;
        }
        else if (!(obj instanceof BaseToken)) {
            return false;
        }
        else if (BaseToken.class.cast(obj).getName() == this.name) {
            return true;
        }
        else {
            return false;
        }
    }
}