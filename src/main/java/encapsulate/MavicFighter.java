package encapsulate;

public class MavicFighter extends Drone {

    public MavicFighter() {
        flyable = new Propeller();
    }

    @Override
    public void display() {
        System.out.println("AttackerDrone display");
    }
}
