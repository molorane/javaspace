package streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

    private static void ps(Integer st) {
        System.out.println(st);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Optional<Integer> sum =
                Stream.of(1, 2, 3, 4, 5, 6, 7)
                        .reduce((x, y) -> x + y); // .reduce(Integer::sum);
        sum.ifPresent(Reduce::ps);
    }

}
