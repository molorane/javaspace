package executors.executor.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

        private CountDownLatch latch;

        public Task(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            latch.countDown();
        }

    }