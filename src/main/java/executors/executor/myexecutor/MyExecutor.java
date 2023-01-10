package executors.executor.myexecutor;

import java.util.concurrent.Executor;

// This class implements Executor interface and should override execute(Runnable) method.
// We provide an overloaded execute method with an additional argument 'times' to create and
// run the threads for given number of times
public class MyExecutor implements Executor {



    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}