package executors.executor.scheduled;

public class Task implements Runnable {
    public void run() {
        System.out.println("Task executed");
    }
}