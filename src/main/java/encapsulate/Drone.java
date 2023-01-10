package encapsulate;

public abstract class Drone {

    protected Flyable flyable;

    public void display() {
        System.out.println("Default display");
    }

    public void performFly() {
        flyable.fly();
    }

}
