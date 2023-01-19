package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IsStreamParallel {

    public static void main(String[] args) {

        IntStream s = IntStream.range(1, 10).filter(i -> (i % 2) == 0).parallel();
        System.out.println(s.isParallel());
    }

}
