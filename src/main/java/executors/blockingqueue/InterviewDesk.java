package executors.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewDesk implements Runnable {

    private BlockingQueue<String> bq;

    public InterviewDesk(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            String candidate;
            while (!(candidate = bq.take()).equalsIgnoreCase("complete")) {
                System.out.println("*** " + candidate + " interviewed ***");
                Thread.sleep(1000);
            }
            System.out.println("All candidates interviewed.");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
