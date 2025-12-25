public class User {

    String username;
    String email;
    int age;

    // Constructor with no parameters
    User() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    // Initial constructor
    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    // Second constructor (constructor overloading)
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    // Third constructor (constructor overloading)
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
