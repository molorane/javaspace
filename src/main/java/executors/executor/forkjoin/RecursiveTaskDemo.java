package executors.executor.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveTaskDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = IntStream.range(1, 1000).boxed().collect(Collectors.toList());

        ForkJoinPool fjp = new ForkJoinPool();
        NumbersRecursiveTask dn = new NumbersRecursiveTask(list);
        Integer sum = fjp.invoke(dn);
        System.out.println(sum);
    }

}
