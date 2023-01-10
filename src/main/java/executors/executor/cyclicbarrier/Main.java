package executors.executor.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        Task task = new Task(cyclicBarrier);
        DelayedTask delayedTask = new DelayedTask(cyclicBarrier);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(delayedTask);
        executorService.shutdown();
    }
}
