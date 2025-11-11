package tokens;
public class List extends BaseToken {
    public List(String name, short argsMin, short argsMax){
        super(name, argsMax, argsMax);
    }

    @Override
    void callMethod(String... args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callMethod'");
    }
}
