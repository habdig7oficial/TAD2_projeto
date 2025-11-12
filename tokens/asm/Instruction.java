package tokens.asm;

import tokens.BaseToken;

abstract public class Instruction extends BaseToken {
    private int lineNumber;
    private String args[];
    public Instruction(String name, short argsMin, short argsMax, int lineNumber, String... args){
        super(name, argsMin, argsMax);
        this.lineNumber = lineNumber;
        this.args = args;
    }
    
    public int getLineNumber() {
        return lineNumber;
    }
    public String[] getArgs() {
        return args;
    }
}
