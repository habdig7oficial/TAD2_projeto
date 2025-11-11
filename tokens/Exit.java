package tokens;

public class Exit extends BaseToken {
    public Exit(String name, short argsMin, short argsMax){
        super(name, argsMax, argsMax);
    }

    @Override
    void callMethod(String... args) {
        System.out.println("Danke Schön!\nAuf wiedersehen");
        System.exit(0);
    }
}
