package streamapi.pimitive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class LongStreams {


    public static void main(String[] args) {

        List<Long> longs = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(longs);
    }

    public static void p1() {
        List<Long> longs = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(longs);
    }

    public static void p2() {
        List<Long> longs = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(longs);
    }
}
