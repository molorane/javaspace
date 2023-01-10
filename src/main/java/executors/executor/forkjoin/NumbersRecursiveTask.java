
package executors.executor.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class NumbersRecursiveTask extends RecursiveTask<Integer> {

        private final List<Integer> list;

        public NumbersRecursiveTask(List<Integer> list) {
            this.list = list;
        }

        @Override
        protected Integer compute() {
            if (list.size() <= 5) {
                return list.stream().mapToInt(x -> x).sum();
            } else {
                int mid = list.size() / 2;
                List<Integer> list1 = list.subList(0, mid);
                List<Integer> list2 = list.subList(mid, list.size());

                NumbersRecursiveTask t1 = new NumbersRecursiveTask(list1);
                NumbersRecursiveTask t2 = new NumbersRecursiveTask(list2);

                t1.fork();
                t2.fork();
                return t1.join() + t2.join();
            }
        }


    }