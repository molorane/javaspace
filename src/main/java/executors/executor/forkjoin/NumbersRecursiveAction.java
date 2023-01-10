package executors.executor.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class NumbersRecursiveAction extends RecursiveAction {

    private final List<Integer> list;

    public NumbersRecursiveAction(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected void compute() {
        // TODO Auto-generated method stub
        if (list.size() <= 2) {
            list.stream().map(n -> 2 + n).forEach(System.out::println);
        } else {
            int mid = list.size() / 2;
            List<Integer> list1 = list.subList(0, mid);
            List<Integer> list2 = list.subList(mid, list.size());

            NumbersRecursiveAction t1 = new NumbersRecursiveAction(list1);
            NumbersRecursiveAction t2 = new NumbersRecursiveAction(list2);

            invokeAll(t1, t2);
        }
    }

}