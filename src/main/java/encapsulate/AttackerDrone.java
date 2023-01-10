package encapsulate;

public class AttackerDrone extends Drone {

    public AttackerDrone() {
        flyable = new Propeller();
    }

    @Override
    public void display() {
        System.out.println("AttackerDrone display");
    }


}
