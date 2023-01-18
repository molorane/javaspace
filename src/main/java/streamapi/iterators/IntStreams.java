package streamapi.iterators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    public static void main(String[] args) {
        pp();
    }

    public static void ppp() {
        // Creating an IntStream
        IntStream stream = IntStream.rangeClosed(3, 89);

        PrimitiveIterator.OfInt ofInt = stream.iterator();
        while(ofInt.hasNext()){
            System.out.println(ofInt.next());
        }
    }

    public static void pp() {
        IntStream evenNmbers = IntStream.of(2, 4, 6, 8, 10);
        Stream<Integer> evenStream = evenNmbers.boxed();

        Iterator<Integer> integerValues = evenStream.iterator();
        integerValues.forEachRemaining(value -> System.out.println("Even Number : " + value));
    }
}
