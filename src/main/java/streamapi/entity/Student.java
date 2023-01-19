package streamapi.entity;

public class Student implements Comparable<Student> {
    String name;
    Gender gender;
    int age;

    public Student(String name, Gender gender, int age) {
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
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.getName());
    }

    public boolean bornBeforeEpoc() {
        return false;
    }

    public boolean isAfrican() {
        return false;
    }
}