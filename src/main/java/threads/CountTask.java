package threads;

import java.util.concurrent.locks.ReentrantLock;

public class CountTask implements Runnable {

    private final ReentrantLock lock;
    public final Counter counter;

    public CountTask(ReentrantLock lock, Counter counter) {
        this.lock = lock;
        this.counter = counter;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            Thread.sleep(100);
            counter.increment();
            counter.increment();
            counter.increment();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void ex() {
        throw new RuntimeException();
    }

    public void printResult() {
        System.out.println("Count " + counter.getCount());
    }
}
