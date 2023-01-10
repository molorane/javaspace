package executors.executor.myexecutor;

import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Task();
        Executor executor = new MyExecutor();
        executor.execute(runnable);
        executor.execute(runnable);
    }

}
