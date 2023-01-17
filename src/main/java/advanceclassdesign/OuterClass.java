package advanceclassdesign;

public class OuterClass {

    private static String name1;

    protected class InnerClass {
        private int age = 100;
        private static String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getName() {
            return name;
        }

        public static void setName(String name) {
            InnerClass.name = name;
        }

        public static void main(String[] args) {
            System.out.println(name1);
        }
    }

    public static void main(String[] args) {
        InnerClass.name = "Java";
        System.out.println(InnerClass.name);
        System.out.println(new OuterClass().new InnerClass().age);
    }
}
