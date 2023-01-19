package streamapi.pimitive;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        System.out.println(IntStream.of(12, 3).sum());

        System.out.println(Arrays.toString(IntStream.of(3, 2, 1, 7).sorted().toArray()));
        System.out.println(
                IntStream.rangeClosed(0, 2000_000_000)
                        .parallel()
                        .reduce(0, ((sum, val) -> sum + val)));
        factorial(5);
    }

    public static void factorial(int num) {
        System.out.println(
                IntStream
                        .rangeClosed(1, num)
                        .reduce((x, y) -> (x * y))
                        .getAsInt()
        );
    }

}
