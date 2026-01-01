public class Car_v3 {

    // .toString() = Method inherited from Object class
    //               Used to return a string representation of the object.
    //               By default, it returns a hash code as a unique identifier.
    //               It can be overridden to provide meaningful details

    String make;
    String model;
    int year;
    String color;

    Car_v3(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
