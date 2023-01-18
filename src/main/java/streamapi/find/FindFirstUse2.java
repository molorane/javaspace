package streamapi.find;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;


public class FindFirstUse2 {
    public static void main(String[] args) {
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(x -> x > 0)
                .sorted()
                .findFirst();

        temperature.ifPresent((x) -> System.out.printf("First matching temperature > 0 is %s", x));
    }
}
