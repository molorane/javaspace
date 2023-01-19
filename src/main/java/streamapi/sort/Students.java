package streamapi.sort;

import streamapi.entity.Gender;
import streamapi.entity.Student;

import java.util.Arrays;
import java.util.List;

public class Students {

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Michael", Gender.FEMALE, 20),
                new Student("Ronaldo", Gender.FEMALE, 22),
                new Student("John", Gender.MALE, 32),
                new Student("John", Gender.MALE, 20),
                new Student("Jesus", Gender.MALE, 32),
                new Student("God", Gender.MALE, 72),
                new Student("Allah", Gender.MALE, 3),
                new Student("Jack", Gender.MALE, 72),
                new Student("Messi", Gender.FEMALE, 11)
        );
    }
}
