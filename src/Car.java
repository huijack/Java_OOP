public class Car {

    String make = "Suzuki";
    String model = "SX4";
    int year = 2012;
    double price = 18000.00;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.println("You drive the " + make + " " + model);
    }

    void brake() {
        System.out.println("You brake the " + make + " " + model);
    }
}
