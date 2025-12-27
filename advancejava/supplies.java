package advancejava;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.function.Supplier;

public class supplies {
    public static void main(String[] args) {

        Supplier<Map<String, Integer>> countryCodeSupplier = () -> {
            Map<String, Integer> countryCodeMap = new HashMap<>();

            countryCodeMap.put("USA", 1);
            countryCodeMap.put("INDIA", 91);
            countryCodeMap.put("UK", 44);
            countryCodeMap.put("AUSTRALIA", 61);
            countryCodeMap.put("CANADA", 1);

            return countryCodeMap;
        };

        Map<String, Integer> countryCodes = countryCodeSupplier.get();
        System.out.println(countryCodes);

        Supplier<Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000) + 1; // 1 to 1000
        };

        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
    }
}
