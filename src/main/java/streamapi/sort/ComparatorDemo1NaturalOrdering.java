package streamapi.sort;

import streamapi.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo1NaturalOrdering {

    public static void main(String[] args) {
        com2();
    }

    public static void com2() {
        List<Student> people = Students.getStudents();

        List<Student> students = people
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(students);
    }

}
