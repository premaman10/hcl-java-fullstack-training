package advancejava;
interface a{
    public void show();
}
// class  b implements a {
// @Override
// public void show(){
//     System.out.println("hello from b");    
// }
// }
public class first {
    public static void main(String[] args) {
        //functional programming
        // imperative vs declarative programming
        // decalarative means we will focusing on what not how
        //helps creating high order functions
        // functional programming helps in creating parallel programming
        //lazy evaluation when using fnctional interface and stream
        //Concurrency favorable design as immutable + stable
        //java is pass by value language


        //normally we create object of class that implements interface
        // a obj = new b();
        // obj.show();

        //anonymous class
        // a obj = new a(){
        //     @Override
        //     public void show(){
        //         System.out.println("hello from anonymous class");    
        //     }
        // };
        // obj.show();


        //lambda expression
        a obj2 = ()->{
            System.out.println("hello from lambda expression");
        };
        obj2.show();

    }
}
