package advancejava;
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
public class streams {
    public static void main(String[] args) {
        // Stream API in Java
        // used to process collections of objects
        // supports functional-style operations on streams of elements
        // helps in writing clean and concise code
        // allows for parallel processing of data

        // Example: Using Stream API to filter and print even numbers from a list
        System.out.println("Even odd label:");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Function<Integer,String> evenOddLabel = n -> (n%2==0) ? "Even" : "Odd";
        numbers.stream()
               .map(evenOddLabel)
               .forEach(label -> System.out.println(label));
        System.out.println("Converting Celcius to Fahrenheit:");
        List<Double> celcius = Arrays.asList(37.0, 38.5, 39.2, 36.8);
        Function<Double,Double> f = c -> (c*9/5)+32;
        celcius.stream()
                .map(f)
                .forEach(far -> System.out.println(far));
        System.out.println("Prices with GST:");
        List<Integer> prices = Arrays.asList(100,200,300,400,500);
        Function<Integer,Double> gst = p ->p+(p*0.18);
        prices.stream()
              .map(gst)
              .forEach(priceWithGst -> System.out.println(priceWithGst));
        System.out.println("Names in uppercase:");
        List<String> names = Arrays.asList("aman","rahul","john","doe");
        Function<String,String> toUpperCase = s -> s.toUpperCase();
        names.stream()
            .map(toUpperCase)
            .forEach(upperName -> System.out.println(upperName));
    }
}
