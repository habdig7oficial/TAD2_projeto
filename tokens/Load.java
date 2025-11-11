package tokens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load extends BaseToken {
    public Load(String name, short argsMin, short argsMax){
        super(name, argsMax, argsMax);
    }

    @Override
    void callMethod(String... args) throws Exception {
        String currentDir = System.getProperty("user.dir");

        Scanner file;
        try {
            file = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(String.format("File %s was not find\nSearch on dir %s", args[0], currentDir));
        }

        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }

        System.out.println(currentDir + args[0]);

        file.close();
    }
}
