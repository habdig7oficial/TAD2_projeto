package tokens.highLevel;

import lib.DataStructs.LinkedList;
import tokens.BaseToken;
import tokens.asm.Instruction;

abstract public class BaseHighLevel extends BaseToken {
    private LinkedList<Instruction> asmList;
    protected BaseHighLevel(String name, short argsMin, short argsMax, LinkedList<Instruction> asmList){
        super(name, argsMin, argsMax);
        this.asmList = asmList;
    }

    public LinkedList<Instruction> getAsmList() {
        return asmList;
    }
}
