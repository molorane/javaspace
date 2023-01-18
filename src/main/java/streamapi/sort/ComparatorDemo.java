package streamapi.sort;

import streamapi.entity.Gender;
import streamapi.entity.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

    static List<String> strings = Arrays.asList("OCA", "OCP", "OCM", "OCE");

    public static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("SaRa", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jack", Gender.MALE, 3),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 11)
        );
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        com2();
    }

    public static void com2() {

        List<Person> people = getPeople();

        System.out.println(
                people
                        .stream()
                        //.sorted(ComparatorDemo.comparator())
                        //.sorted(Comparator.reverseOrder())
                        .sorted(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER))
                        // .sorted(Comparator.comparing(Person::getName))
                        .collect(Collectors.toList()));
    }

    public static void com1() {

        List<Person> people = getPeople();

        System.out.println(
                people
                        .stream()
                        //.sorted(ComparatorDemo.comparator())
                        //.sorted(Comparator.reverseOrder())
                        //.sorted(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER))
                        // .sorted(Comparator.comparing(Person::getName))
                        .collect(Collectors.toList()));
    }

    public static Comparator<Person> comparator() {
        return new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

}
