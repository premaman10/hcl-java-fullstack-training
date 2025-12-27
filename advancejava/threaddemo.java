package advancejava;

public class threaddemo {
    public static void main(String[] args) {
    //  thread1 th1 = new thread1();
    //     th1.run();
        for(int i=1;i<=5;i++){
            final int idx = i;
            Runnable r = ()->{
                System.out.println("This is thread " + idx);
            };
            r.run();
                
        }
        System.out.println("Main thread ended");

    }
}
// class thread1 implements Runnable{
//     @Override
//     public void run(){
//         System.out.println("This is thread 1");
//     }
// }
