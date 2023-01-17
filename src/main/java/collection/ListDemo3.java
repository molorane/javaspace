package collection;

import java.util.*;

public class ListDemo3 {

    public static void main(String[] args) {

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
