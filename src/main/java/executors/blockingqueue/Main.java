package executors.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(3, true);
        InterviewSchedule producer = new InterviewSchedule(bq);
        InterviewDesk consumer = new InterviewDesk(bq);
        InterviewDesk consumer2 = new InterviewDesk(bq);
        InterviewDesk consumer3 = new InterviewDesk(bq);

        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(producer);
        es.execute(consumer);
        es.execute(consumer2);
        es.execute(consumer3);
        es.shutdown();
    }

}
