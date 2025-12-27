package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Stream;

public class filereadgenratestats {
    public static void main(String[] args) {

        Path file = Path.of("data.txt");

        if (!Files.exists(file)) {
            System.out.println("File does not exist.");
            return;
        }

        try (BufferedReader br = Files.newBufferedReader(file)) {

            Stream<String> lines = br.lines();

            // Total Lines
            long lineCount = lines.count();

            // Re-open stream (streams can be consumed only once)
            Stream<String> linesForWords = Files.lines(file);
            Stream<String> linesForChars = Files.lines(file);

            // Word Count Function
            Function<String, Integer> wordCounter =
                    s -> s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;

            // Character Count Function
            Function<String, Integer> charCounter =
                    s -> s.length();

            long wordCount = linesForWords
                    .map(wordCounter)
                    .reduce(0, Integer::sum);

            long characterCount = linesForChars
                    .map(charCounter)
                    .reduce(0, Integer::sum);

            System.out.println("File Statistics:");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + characterCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
