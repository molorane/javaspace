package streamapi.pimitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DoubleStreams {

    public static void main(String[] args) {
        p1();
    }

    public static void p1() {
        List<Double> doubles = DoubleStream.of(1d, 2d, 3d, 4d, 5d)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(doubles);
    }
}
