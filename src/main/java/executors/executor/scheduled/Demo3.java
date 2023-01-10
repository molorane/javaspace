package executors.executor.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Demo3 {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public static void main(String[] args) throws InterruptedException {
        final ScheduledFuture<?> scheduledFuture =
                scheduler.scheduleAtFixedRate(() -> System.out.println("sing"), 1, 3, TimeUnit.SECONDS);

        scheduler.schedule(() -> scheduledFuture.cancel(true), 20, TimeUnit.SECONDS);

        Thread.sleep(100);
        scheduler.shutdown();
    }

}
