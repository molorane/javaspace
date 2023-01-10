package executors.callable;

import java.util.concurrent.Callable;

class Factorial implements Callable<Long> {

    private long n;

    public Factorial(long n) {
        this.n = n;
    }

    public Long call() throws Exception {
        if (n <= 0) {
            throw new Exception("for finding factorial, N should be > 0");
        }
        long fact = 1;
        for (long counter = 1; counter <= n; counter++) {
            Thread.sleep(400);
            fact *= counter;
        }
        return fact;
    }
}

