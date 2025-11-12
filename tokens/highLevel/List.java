package tokens.highLevel;

import lib.DataStructs.LinkedList;
import tokens.BaseToken;
import tokens.asm.Instruction;

public class List extends BaseHighLevel {
    public List(String name, short argsMin, short argsMax, LinkedList<Instruction> asmList){
        super(name, argsMax, argsMax, asmList);
    }

    @Override
    protected void callMethod(String... args) {
        System.out.println(this.getAsmList().iterator().hasNext());
        while (getAsmList().iterator().hasNext()) {
            System.out.println(getAsmList().iterator().next());
        }
    }
}
