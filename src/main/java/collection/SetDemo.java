package collection;

import java.util.*;


public class SetDemo {

    public static void main(String[] args) {

       /* Set<Integer> list = new HashSet<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        System.out.println(list); */

        /* Set<Integer> list2 = new LinkedHashSet<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(0);
        System.out.println(list2); */

        Set<Employee> list3 = new TreeSet<>(new CompareEmployee());
        list3.add(new Employee(3, ""));
        list3.add(new Employee(4, ""));
        list3.add(new Employee(5, ""));
        System.out.println(list3);
    }
}
