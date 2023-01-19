package streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Optional<Integer> sum =
                Stream.of(1, 2, 3, 4, 5, 6, 7)
                        .reduce(Integer::sum); // .reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }

}
