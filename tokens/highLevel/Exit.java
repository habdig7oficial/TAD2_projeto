package tokens.highLevel;

import tokens.BaseToken;

public class Exit extends BaseHighLevel {
    public Exit(String name, short argsMin, short argsMax){
        super(name, argsMax, argsMax);
    }

    @Override
    protected void callMethod(String... args) {
        System.out.println("Danke Schön!\nAuf wiedersehen");
        System.exit(0);
    }
}
