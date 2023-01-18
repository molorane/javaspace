package streamapi.pimitive;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(IntStream.of(12, 3).sum());
        System.out.println(Arrays.toString(IntStream.of(3, 2, 1, 7).sorted().toArray()));
        System.out.println(
                IntStream.range(10, 1_0)
                        //.parallel()
                        .reduce(0, ((sum, val) -> sum + val)));
        factorial();
    }

    public static void factorial() {
        System.out.println(
                IntStream
                        .rangeClosed(1, 5)
                        .reduce((x, y) -> (x * y))
                        .getAsInt()
        );
    }

}
