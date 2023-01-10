package executors.executor.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveActionDemo {

    public static void main(String[] args) {

        final List<Integer> list = IntStream.range(1, 1000).boxed().collect(Collectors.toList());

        ForkJoinPool pool = new ForkJoinPool(); // creates threads equal number of processors / cores
        NumbersRecursiveAction dn = new NumbersRecursiveAction(list);
        pool.invoke(dn);
        pool.shutdown();
    }
}
