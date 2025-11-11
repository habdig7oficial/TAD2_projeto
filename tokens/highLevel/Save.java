package tokens.highLevel;

import lib.DataStructs.LinkedList;
import tokens.BaseToken;
import tokens.asm.Instruction;

public class Save extends BaseHighLevel {
    public Save(String name, short argsMin, short argsMax, LinkedList<Instruction> asmList){
        super(name, argsMin, argsMax, asmList);
    }

    @Override
    protected void callMethod(String... args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callMethod'");
    }
}
