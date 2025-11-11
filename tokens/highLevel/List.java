package tokens.highLevel;

import tokens.BaseToken;

public class List extends BaseHighLevel {
    public List(String name, short argsMin, short argsMax){
        super(name, argsMax, argsMax);
    }

    @Override
    protected void callMethod(String... args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callMethod'");
    }
}
