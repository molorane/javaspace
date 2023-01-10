package encapsulate;

public class TankDrone extends Drone {

    public TankDrone() {
        flyable = new NotFlyable();
    }

    @Override
    public void display() {
        System.out.println("Tank drone display");
    }
}
