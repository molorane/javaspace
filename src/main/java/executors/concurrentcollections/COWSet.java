package executors.concurrentcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;


public class COWSet {

    public static void main(String[] args) {
        Set<String> aList = new CopyOnWriteArraySet<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        aList.add("three");
        Iterator<String> listIter = aList.iterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four");
        }
        System.out.println(aList);
    }
}