package executors.callable;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int x = 5;
        Callable<Long> task = new Factorial(x);
        ExecutorService tp = Executors.newSingleThreadExecutor();
        Future<Long> future = tp.submit(task);
        System.out.println("Doing something..");
        long result = future.get();
        System.out.println("Completed...");
        System.out.printf("factorial of %d is %d", x, result);
        tp.shutdown();
    }

}