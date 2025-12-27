package advancejava;

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class functionalinterface {
    public static void main(String[] args) {
        // int []arr = new int[]{1,2,3,4,5};
        // increment inc = new increment();
        // for(int i =0;i<arr.length;i++){
        //     arr[i] = inc.apply(arr[i]);
        //     System.out.println(arr[i]);
        // }

        List<String> names = Arrays.asList("aman","rahul","john","doe");
        List<Integer> nameLength = new ArrayList<>();
        Function<String,Integer> f = s -> s.length();
        for(String name:names){
            nameLength.add(f.apply(name));
        }
        System.out.println(nameLength);

    }
}
// class increment implements Function<Integer,Integer>{
//     public Integer apply(Integer t){
//         return t+1;
//     }
// }