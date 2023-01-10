package encapsulate;

import dependencyinversion.A;

public class Main {

    public static void main(String... args) {

        Drone drone = new AttackerDrone();
        drone.performFly();
    }
}
