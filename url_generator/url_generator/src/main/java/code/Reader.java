package code;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Component
public class Reader {
    private final Scanner scanner;

    public Reader() {
        File file = new File("src/main/resources/data.txt");
        try {
            this.scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String readNewUrl(){
        if (!scanner.hasNextLine()){
            return null;
        }
        return scanner.nextLine();
    }
}
