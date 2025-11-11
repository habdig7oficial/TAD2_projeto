package tokens.asm;

import tokens.BaseToken;

abstract public class Instruction extends BaseToken {
    private int lineNumber;
    public Instruction(String name, short argsMin, short argsMax, int lineNumber){
        super(name, argsMin, argsMax);
        this.lineNumber = lineNumber;
    }
    
    public int getLineNumber() {
        return lineNumber;
    }
}
