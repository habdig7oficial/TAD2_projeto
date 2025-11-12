package tokens.highLevel;

import java.lang.reflect.Constructor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import lib.Searcher;
import lib.DataStructs.LinkedList;
import tokens.BaseToken;
import tokens.asm.Instruction;
import tokens.asm.Mov;

public class Load extends BaseHighLevel {
    public Load(String name, short argsMin, short argsMax, LinkedList<Instruction> asmList){
        super(name, argsMax, argsMax, asmList);
    }

    Instruction instructionSet[] = {
        new Mov("MOV", 0)
    };

    @Override
    protected void callMethod(String... args) throws Exception {
        String currentDir = System.getProperty("user.dir");

        Scanner file;
        try {
            file = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(String.format("File %s was not find\nSearch on dir %s", args[0], currentDir));
        }


        for (int i = 0; file.hasNextLine(); i++) {
            String line = file.nextLine();
            if (!line.isEmpty()) {

                String asmCommands[] = line.split("\s");

                Searcher<Instruction, String> s = new Searcher<Instruction, String>();

                short location = s.search(instructionSet, asmCommands[0].trim().toUpperCase());
                if(location != -1){
                    try {
                        Instruction newInstruction = null;
                        switch (instructionSet[location]) {
                            case Mov n:
                                    newInstruction = new Mov(n.getName(), i, Arrays.copyOfRange(asmCommands, 1, asmCommands.length));
                                break;
                        
                            default:
                        }
                        this.getAsmList().append(newInstruction);
                        System.out.println(newInstruction);
                    } catch (Exception e) {
                        System.out.println("--- ERROR ---\n" + e.getMessage());
                    }
                }
                else 
                    System.out.println("--- ERROR ---\nInvalid Command!");

                System.out.println(asmCommands[0].trim());

                //this.getAsmList().append();
            }
                
            //System.out.println(file.nextLine());
        }

        System.out.println(this.getAsmList());
        System.out.println(currentDir + args[0]);

        file.close();
    }
}
