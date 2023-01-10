package executors.executor.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        Runnable task = new Task();

        ses.schedule(task, 2, TimeUnit.SECONDS);
        ses.shutdown();
    }
}
