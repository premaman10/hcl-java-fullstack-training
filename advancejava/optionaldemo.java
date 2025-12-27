package advancejava;
import java.util.Optional;


//optional is used to avoid null pointer exception

public class optionaldemo {
    public static void main(String[] args) {
        System.out.println("This is code for optional demo.");
        
                // Creates an Optional that definitely contains a non-null String value.
                // Using Optional.of() will throw NullPointerException if the value is null.
                Optional<String> optionalString = Optional.of("Hello, Optional!");

                // Creates an empty Optional object with no value present.
                // Useful to represent absence of a value without using null.
                Optional<Integer> optionalNumber = Optional.empty();

                // Creates an Optional that may or may not contain a value.
                // Since null is passed here, this results in an empty Optional.
                Optional<Double> optionalDouble = Optional.ofNullable(null);


                // Check if a value is present in optionalString
                if (optionalString.isPresent()) {
                    System.out.println("Value in optionalString: " + optionalString.get());
                } else {
                    System.out.println("optionalString is empty.");
                }

    }   
}