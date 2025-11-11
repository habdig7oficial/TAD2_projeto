package tokens.asm;

import tokens.BaseToken;

abstract class Instruction extends BaseToken {
    public Instruction(String name, short argsMin, short argsMax){
        super(name, argsMin, argsMax);
    }
}
