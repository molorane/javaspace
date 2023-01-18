package streamapi.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndPeek {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5).limit(5)
                .map(i -> i * i)
                .peek(i -> System.out.print(i))
                .forEach(i -> System.out.print(i));

        System.out.println();

        Stream.builder().add("O").add("C").add("P").add("O").build()
                .distinct().peek(System.out::print).count();

        System.out.println();

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
