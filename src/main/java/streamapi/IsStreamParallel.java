package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IsStreamParallel {

    public static void main(String[] args) {

        IntStream s = IntStream.range(1, 10).filter(i -> (i % 2) == 0);
        System.out.println(s.isParallel());

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> st = ints.parallelStream().filter(i -> (i % 2) == 0);
        System.out.println(st.isParallel());

        ints = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(ints.parallelStream().filter(i -> (i % 2) == 0).sequential().parallel().
                isParallel());
    }

}
