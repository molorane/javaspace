package advanceclassdesign;

public class Local {

     int age;

    public static void main(String[] args) {

        enum Day {
            M,
            T,
            FRIDAY;
        }

        class K {

            public void main() {
                Local loca = new Local();
                loca.age = 190;
                System.out.println(loca.age);
            }
        }

        new K().main();
        System.out.println();
    }
}
