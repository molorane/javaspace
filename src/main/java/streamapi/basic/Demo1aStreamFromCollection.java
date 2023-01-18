package streamapi.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class Demo1aStreamFromCollection {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        String[] array = new String[]{"1","2","3"};
        Stream<String> stream = Arrays.stream(array);
        List<String> list = stream.toList();
    }

    public static void demo2() {
        double [] array = new double[]{1,2,3,4,5,6};
        DoubleStream stream = Arrays.stream(array);
        List<Double> list = stream.boxed().collect(Collectors.toList());
        System.out.println(list);
    }

    public void demo3() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = list.parallelStream();
    }
}
