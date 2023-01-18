package streamapi.basic;

import streamapi.TimeIt;

import java.util.List;
import java.util.stream.LongStream;

public class Demo1bPrimeNumbers {

    private static boolean isPrime(long val) {
        for (long i = 2; i <= val / 2; i++) {
            if ((val % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Parallel");
        TimeIt.code(Demo1bPrimeNumbers::parallel);
        System.out.println("none parallel");
        TimeIt.code(Demo1bPrimeNumbers::noneParallel);
    }

    public static void noneParallel() {
        long numOfPrimes = LongStream
                .rangeClosed(2, 1_500_000)
                .filter(Demo1bPrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    }

    public static void parallel() {
        long numOfPrimes = LongStream
                .rangeClosed(2, 1_500_000)
                .parallel()
                .filter(Demo1bPrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    }
}
