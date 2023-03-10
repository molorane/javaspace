package collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.spliterator();

        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        System.out.println(list2);

        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee(4, "Java4"));
        employees.add(new Employee(1, "Java1"));
        employees.add(new Employee(3, "Java3"));

        Iterator<Employee> iterator = employees.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }

}
