package filehandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class filecopy {
    public static void main(String[] args) {
        //this is simple copying data
        // Path fileLocation = Path.of("data.txt");
        // if(Files.exists(fileLocation)){
        //     Path copyLocation = Path.of("data_copy.txt");
        //     try {
        //         Files.copy(fileLocation, copyLocation);
        //         System.out.println("File copied successfully to " + copyLocation.toString());
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // } else {
        //     System.out.println("Source file does not exist. Cannot perform copy.");
        // }
        //we want that now we will read the data from one file print it in console than copy that data to another file
        Path sourceFile = Path.of("data.txt");
        Path destinationFile = Path.of("data_copy.txt");
        try {
            if (Files.exists(sourceFile)) {
                // Read data from source file
                String content = Files
                        .readString(sourceFile);
                System.out.println("Content of source file:");
                System.out.println(content);
                // Write data to destination file
                Files.writeString(destinationFile, content);
                System.out.println("Data copied to " + destinationFile.toString());
            } else {
                System.out.println("Source file does not exist. Cannot perform copy.");
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}
}