package encapsulate;

public class AerialDrone extends Drone {


    public AerialDrone() {
        flyable = new Jet();
    }

    @Override
    public void display() {
        System.out.println("Aerial drone display");
    }

}
