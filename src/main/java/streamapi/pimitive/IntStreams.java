package streamapi.pimitive;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    public static void main(String[] args) {
        p3();
    }

    public static void ppp() {
        // Creating an IntStream
        IntStream stream = IntStream.range(3, 89);

        Stream<Integer> stream1 = stream.boxed();

        Stream<Object> stream2 = Stream.concat(stream1,
                Stream.of("Geeks", "for", "Geeks"));

        stream2.forEach(System.out::println);
    }


    public static void p3() {
        List<String> list = List.of("Java", "OCP");
        int sum = list.stream()
                .filter(w -> w.length() >= 3)
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }
}
