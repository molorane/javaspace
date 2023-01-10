package encapsulate;

public class CarDrone extends Drone {

    public CarDrone() {
        flyable = new NotFlyable();
    }

    @Override
    public void display() {
        System.out.println("Car drone display");
    }
}
