package advancejava;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;


public class consum {
    
    public static void main(String[] args) {
        List<String> grocerylist = Arrays.asList("Milk","Eggs","Bread","Butter","Cheese");
        printgroceryitem printitem = new printgroceryitem();
        grocerylist.forEach(i->printitem.accept(i));
        System.out.println("-----");
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        squareofnum squarenum = new squareofnum();
        numbers.forEach(i->squarenum.accept(i));
    }
}
class printgroceryitem implements Consumer<String>{
    @Override
    public void accept(String item){
        System.out.println("Grocery Item: "+item);
    }
}
class squareofnum implements Consumer<Integer>{
    @Override
    public void accept(Integer num){
        System.out.println("Square of "+num+" is: "+(num*num));
    }
}
