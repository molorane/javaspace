package executors.executor.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        Runnable r = () -> System.out.println("Task executed");

        ses.scheduleAtFixedRate(r, 1, 1, TimeUnit.SECONDS);

        Thread.sleep(9000);
        ses.shutdownNow();
    }
}
