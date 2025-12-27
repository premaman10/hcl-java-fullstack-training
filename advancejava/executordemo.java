package advancejava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class executordemo {

    public static void main(String[] args) throws Exception {

        // ================= FIXED THREAD POOL =================
        ExecutorService exec = Executors.newFixedThreadPool(3); // pool of 3 threads

        for (int i = 1; i < 10; i++) {
            final int fi = i;

            Callable<String> newThread = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    System.out.println("Fixed Pool Task: " + fi);
                    return "Success";
                }
            };

            exec.submit(newThread);
        }

        exec.shutdown(); // shutdown executor service


        // ================= CACHED THREAD POOL =================
        ExecutorService exec2 = Executors.newCachedThreadPool();

        final int fi = 5;
        Callable<Long> newThread2 = new Callable<Long>() {
            @Override
            public Long call() {
                long sum = 0;
                for (int i = 1; i <= fi; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        Future<Long> future = exec2.submit(newThread2);

        long result = future.get(); // FIXED: was status.get()
        System.out.println("Sum result: " + result);

        exec2.shutdown();



        // adding array elements using diferent threads
        // adding array elements using different threads
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ExecutorService exec3 = Executors.newFixedThreadPool(10);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            final int index = i;
            Callable<Integer> task = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    sum += arr[index];
                    return arr[index];
                }
            };
            Future<Integer> futureResult = exec3.submit(task);
            System.out.println("Added element: " + futureResult.get());
            // boolean b = exec3.
            
    }
}
}
