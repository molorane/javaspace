package streamapi.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo5StreamForEach {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

       Stream<Integer> stream = list.stream();
                stream.forEach((x) -> System.out.println(x));
    }
}
