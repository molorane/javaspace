package executors.executor.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CountDownLatch countDownLatch = new CountDownLatch(5);
        executorService.submit(new Task(countDownLatch));
        executorService.submit(new Task(countDownLatch));
        executorService.submit(new Task(countDownLatch));
        executorService.submit(new Task(countDownLatch));
        executorService.submit(new Task(countDownLatch));
        executorService.submit(new Task(countDownLatch));

        countDownLatch.await();

        System.out.println("All dependent tasks completed.");
        executorService.shutdown();
    }

}
