package filehandling;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class listdir {

    // Recursive method (similar to formatDir)
    public static void formatDir(Path dir, int indentation) throws IOException {

        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(dir)) {
            for (Path path : dirStream) {

                // indentation using tabs
                for (int i = 0; i < indentation; i++) {
                    System.out.print("\t");
                }

                System.out.println(path.getFileName());

                // recursive call
                if (Files.isDirectory(path)) {
                    formatDir(path, indentation + 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Path dirLocation = Path.of("C:\\Users\\amanp\\Desktop\\HCL TRAINING\\filehandling");

        if (Files.exists(dirLocation)) {
            System.out.println("Directory Found");
            formatDir(dirLocation, 1);
        } else {
            System.out.println("Directory not found");
        }
    }
}
