package streamapi.sort;

import streamapi.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo2Comparator1 {

    public static void main(String[] args) {
        com1();
    }

    public static void com1() {

        List<Student> people = Students.getStudents();

        List<Student> students = people
                .stream()
                .sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .collect(Collectors.toList());

        System.out.println(students);
    }

}
