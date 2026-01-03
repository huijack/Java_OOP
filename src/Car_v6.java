public class Car_v6 {

    // Composition = Represents a "part-of" relationship between objects.
    //               For example, an Engine is "part of" a Car.
    //               Allows complex objects to be constructed from smaller objects.

    private final String model;
    private final int year;
    private final Engine engine;

    String getModel() {
        return this.model;
    }

    String getYear() {
        return String.valueOf(this.year);
    }

    String getEngineType() {
        return this.engine.type;
    }

    Car_v6(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " has started.");
    }
}
