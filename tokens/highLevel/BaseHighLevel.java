package tokens.highLevel;

import tokens.BaseToken;

abstract public class BaseHighLevel extends BaseToken {
    protected BaseHighLevel(String name, short argsMin, short argsMax){
        super(name, argsMin, argsMax);
    }
}
