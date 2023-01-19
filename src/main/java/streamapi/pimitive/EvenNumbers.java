package streamapi.pimitive;

import java.util.stream.IntStream;

public class EvenNumbers {

    public static void main(String[] args) {
        IntStream
                .range(0, 10)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }
}