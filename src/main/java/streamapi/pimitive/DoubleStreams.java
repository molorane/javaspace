package streamapi.pimitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DoubleStreams {

    public static void main(String[] args) {
        p2();
    }

    public static void p1() {
        List<Double> doubles = DoubleStream.of(1d, 2d, 3d, 4d, 5d)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(doubles);
    }

    public static void p2() {
        Object[] objArrayOfIntArrays1 = new Object[]{
                new int[]{1, 2}, // add 2
                new int[]{1, 2}, // add 2
                new int[]{3, 2}, // query freq 2
                new int[]{2, 2}, // delete 2
                new int[]{3, 2}, // query freq 2
        };

        List<List<Integer>> primitiveList = Arrays.stream(objArrayOfIntArrays1)
                .map(q -> {
                    return Arrays.stream(
                                    (int[]) q).boxed()
                            .collect(Collectors.toList());
                })
                .collect(Collectors.toList());

        System.out.println(primitiveList);
    }
}
