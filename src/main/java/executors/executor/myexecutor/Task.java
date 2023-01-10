package executors.executor.myexecutor;

// This Task class implements Runnable, so its a Thread object
public class Task implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Calling  %d\n", 3);
        }
    }
}