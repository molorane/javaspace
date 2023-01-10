
package dependencyinversion;

public class Main {

    public static void main(String... args) {
        A a = new A(new Eagle());
    }
}
