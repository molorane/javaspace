package streamapi.pimitive;

import java.util.Arrays;
import java.util.OptionalLong;

public class Boxed {

    static void miniMaxSum(int[] arr) {

        OptionalLong min = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToLong(x -> x)
                .limit(4)
                .min();

        OptionalLong max = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToLong(x -> x)
                .limit(4)
                .max();

        long sum = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToLong(x -> x)
                .skip(1)
                .sum();

        System.out.printf("%s %s %s", min.orElse(0), max.getAsLong(), sum);
    }

    public static void main(String[] args) {
        int[] li = {1, 2, 3, 4, 5, 6, 7, 8};
        miniMaxSum(li);
    }

}
