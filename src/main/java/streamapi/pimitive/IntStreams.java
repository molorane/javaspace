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

        // Creating a Stream of Integers 
        // Using IntStream boxed() to return 
        // a Stream consisting of the elements 
        // of this stream, each boxed to an Integer. 
        Stream<Integer> stream1 = stream.boxed();

        Stream<Object> stream2 = Stream.concat(stream1,
                Stream.of("Geeks", "for", "Geeks"));

        // Displaying the elements 
        stream2.forEach(System.out::println);
    }

    public static void pp() {
        IntStream evenNmbers = IntStream.of(2, 4, 6, 8, 10);
        Stream<Integer> evenStream = evenNmbers.boxed();

        Iterator<Integer> integerValues = evenStream.iterator();
        integerValues.forEachRemaining(value -> System.out.println("Even Number : " + value));
    }

    public static void p() {
        // Creating a IntStream from values 10 to 14. End index is exlusive.
        IntStream intStream = IntStream.range(10, 15);

        // calling boxed() method on intStream
        Stream<Integer> streamInt = intStream.boxed();

        streamInt.forEach(value -> System.out.println(value));
    }

    public static void p1() {

        //It works perfectly!!
        List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());

        //Compilation Error !!
        // IntStream.of(1,2,3,4,5)
        //	    .collect(Collectors.toList());
    }

    public static void p2() {
        //Get the collection and later convert to stream to process elements
        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints);

        //Stream operations directly
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .max(Integer::compareTo);

        System.out.println(max);
    }

    public static void p3() {
        List<String> list = List.of("Java", "OCP");
        int sum = list.stream()
                .filter(w -> w.length() >= 3)
                .mapToInt(w -> w.length())
                .sum();
        System.out.println(sum);
    }
}
