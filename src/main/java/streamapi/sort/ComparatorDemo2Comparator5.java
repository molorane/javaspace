package streamapi.sort;

import streamapi.entity.Student;

import java.util.Comparator;

public class ComparatorDemo2Comparator5 {

    public static void main(String[] args) {
        Comparator<Student> comparatorByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Student> comparatorByAge = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        Students.getStudents()
                .stream()
                .distinct()
                .sorted(comparatorByName.thenComparing(comparatorByAge).reversed())
                .forEach(System.out::print);
    }

}
