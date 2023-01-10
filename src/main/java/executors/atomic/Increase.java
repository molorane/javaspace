package executors.atomic;

public class Increase extends Thread {
        public void run() {
            Main.integer++;
            Main.atomicInteger.incrementAndGet();
        }
    }

