package collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo1 {

    public static void main(String[] args) {

        NavigableSet<Integer> list = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list.higher(3));
    }
}
