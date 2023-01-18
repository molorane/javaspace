package streamapi.find;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMax {
    public static void main(String args[]) {
        //maxMarks(IntStream.of(52, 60, 99, 80, 76)); // #1
        maxMarks(Stream.of(1, 2, 3, 4, 5));
    }

    public static void maxMarks(IntStream marks) {
        OptionalInt max = marks.max(); // #2
        max.ifPresent(System.out::println);
        if (max.isPresent()) { // #3
            System.out.println(max.getAsInt());
        }
    }

    public static void maxMarks(Stream<Integer> tem) {
        Optional<Integer> max = tem.max(Integer::compareTo); // #2
        if (max.isPresent()) { // #3
            System.out.println(max.get());
        }
        max.ifPresent(System.out::println);
    }
}