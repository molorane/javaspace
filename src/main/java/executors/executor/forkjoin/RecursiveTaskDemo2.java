package executors.executor.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveTaskDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = IntStream.range(1, 1000).boxed().collect(Collectors.toList());

        ForkJoinPool fjp = new ForkJoinPool();
        NumbersRecursiveAction dn = new NumbersRecursiveAction(list);
        Integer sum = fjp.invoke(dn);
        System.out.println(sum);
    }


    @SuppressWarnings("serial")
    static class NumbersRecursiveAction extends RecursiveTask<Integer> {

        private final List<Integer> list;

        public NumbersRecursiveAction(List<Integer> list) {
            this.list = list;
        }

        @Override
        protected Integer compute() {
            if (list.size() <= 2) {
                return list.stream().mapToInt(x -> x).sum();
            } else {
                int mid = list.size() / 2;
                List<Integer> list1 = list.subList(0, mid);
                List<Integer> list2 = list.subList(mid, list.size());

                NumbersRecursiveAction t1 = new NumbersRecursiveAction(list1);
                NumbersRecursiveAction t2 = new NumbersRecursiveAction(list2);

                t2.fork();

                return t1.compute() + t2.join();

                /**
                 * return t2.join() + t1.compute();
                 * not efficient because join() blocks current thread
                 * which means t1.compute() will also not be executed in parallel with the current thread
                 *
                 * But
                 * return t1.compute() + t2.join();
                 * allows t1.compute() to use current thread without waiting, which allows t1 to
                 * execute in parallel with t2.join
                 */
            }
        }
    }
}
