package executors.atomic;


import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static Integer integer = 0;
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread increases[] = new Increase[10];
        Thread decreases[] = new Decrease[10];

        for (int i = 0; i < 10; i++) {
            increases[i] = new Increase();
            increases[i].start();
        }

        for (int i = 0; i < 10; i++) {
            decreases[i] = new Decrease();
            decreases[i].start();
        }

        for (int i = 0; i < 10; i++) {
            increases[i].join();
        }

        for (int i = 0; i < 10; i++) {
            decreases[i].join();
        }

        System.out.printf("Integer value = %d AtomicInteger value = %d ", integer, atomicInteger.get());
    }

}
