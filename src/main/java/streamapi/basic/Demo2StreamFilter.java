package streamapi.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2StreamFilter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> even = list.stream()
                .filter(Demo2StreamFilter::even)
                .collect(Collectors.toList());

        IntStream intStream = IntStream.of(1,2,3,4,5,6);

        List<Integer> even2 = intStream.filter(Demo2StreamFilter::odd)
                        .boxed()
                                .collect(Collectors.toList());
        System.out.println(even);
        System.out.println(even2);
    }

    public static boolean even(int x){
        return x % 2 == 0;
    }

    public static boolean odd(int x){
        return x % 2 == 1;
    }
}
