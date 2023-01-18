package streamapi.map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndPeek {

    public static void main(String[] args) {
        peek2();
    }

    public static void peek1() {
        Stream.builder().add("O").add("C").add("P").add("O").build()
                .distinct()
                .peek(System.out::print)
                .count();

    }

    public static void peek2() {
        Stream.of(1, 2, 3, 4, 5, 6)
                .limit(5)
                .map(i -> i * i)
                .peek(i -> System.out.print(i+" "))
                .forEach(i -> System.out.println(i));
    }

    public static void peek3() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
