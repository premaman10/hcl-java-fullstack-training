package advancejava;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class predicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35,40,45,50);
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                                        .filter(isEven)
                                        .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);


        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "orange");
        Predicate<String> startsWithA = (s) -> s.startsWith("a");
        List<String> aWords = words.stream()
                                .filter(startsWithA)
                                .collect(Collectors.toList());
        System.out.println("Words starting with 'a': " + aWords);

        
    }

}
