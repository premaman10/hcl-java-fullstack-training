package filehandling;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class files {
    public static void main(String[] args) {

        Path fileLocation = Path.of("data.txt");

        try {
            if (Files.exists(fileLocation)) {
                System.out.println("File exists");
                System.out.println("File size: " + Files.size(fileLocation) + " bytes");
                System.out.println(Files.getLastModifiedTime(fileLocation));
            } else {
                System.out.println("File does not exist");

                // create file
                Files.createFile(fileLocation);

                // write to file
                try (BufferedWriter writer = Files.newBufferedWriter(fileLocation)) {
                    String s = "This is a sample text.";
                    writer.write(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
