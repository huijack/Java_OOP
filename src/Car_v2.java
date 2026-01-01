public class Car_v2 {

    String model;
    String color;

    // setup a constructor
    Car_v2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
