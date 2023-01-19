package streamapi.sort;

import streamapi.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo2Comparator2 {

    public static void main(String[] args) {
        com2();
    }

    public static void com2() {

        List<Student> people = Students.getStudents();

        System.out.println(
                people
                        .stream()
                        .sorted(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER))
                        .collect(Collectors.toList()));
    }
}
