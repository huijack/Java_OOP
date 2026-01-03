public class Car_v5 {

    // GETTERS AND SETTERS
    // They help to protect object data and add rules for accessing or modifying them.
    // GETTERS = Methods that make a field READABLE.
    // SETTERS = Methods that make a field WRITEABLE.

    private final String model;
    private String color;
    private int price;

    Car_v5(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "RM" + this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be less than 0.");
        } else {
            this.price = price;
        }
    }
}
