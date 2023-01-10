package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String... args) throws ExecutionException, InterruptedException {
        Counter counter = new Counter();
        CountTask countTask = new CountTask(new ReentrantLock(true), counter);
        Thread t1 = new Thread(countTask);
        Thread t2 = new Thread(countTask);
        Thread t3 = new Thread(countTask);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        countTask.printResult();
    }
}
