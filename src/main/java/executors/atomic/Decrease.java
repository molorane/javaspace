package executors.atomic;

public class Decrease extends Thread {
        public void run() {
            Main.integer--;
            Main.atomicInteger.decrementAndGet();
        }
    }