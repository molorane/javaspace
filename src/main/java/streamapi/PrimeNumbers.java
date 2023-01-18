package streamapi;

import java.util.stream.LongStream;

public class PrimeNumbers {

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
        TimeIt.code(PrimeNumbers::parallel);
        System.out.println("none parallel");
        TimeIt.code(PrimeNumbers::noneParallel);
    }

    public static void noneParallel() {
        long numOfPrimes = LongStream
                .rangeClosed(2, 900_000)
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    }

    public static void parallel() {
        long numOfPrimes = LongStream
                .rangeClosed(2, 900_000)
                .parallel()
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    }
}
