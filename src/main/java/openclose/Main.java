package openclose;

public class Main {

    public static void main(String... args) {

        Car car = new Suzuki31Bukkie();
        TollGate tollGate = new TollGate();

        tollGate.determineRoute(car);
    }
}
