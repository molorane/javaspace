package advanceclassdesign;

public class AnonymousClass {

    static interface Animal {
        public abstract void run();
    }

    public static void main(String[] args) {


        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("Running anonymous class");
            }
        };

        Animal animal1 = new Animal() {
            @Override
            public void run() {

            }
        };

        animal.run();
        animal1.run();

        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(new AnonymousClass());
    }
}
