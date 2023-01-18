package streamapi.entity;

public class Person implements Comparable<Person> {
    String name;
    Gender gender;
    int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", gender=" + gender + ", age=" + age + "]\n";
    }

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean bornBeforeEpoc() {
        return false;
    }

    public boolean isAfrican() {
        return false;
    }
}