public class Main {

    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        /*
        Car car = new Car();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
         */

        // Constructors = A special method to initialize an object
        //                You can define your own constructors
        //                and pass arguments to them

        /*
        Student student1 = new Student("Spongebob", 30, 3.14);
        Student student2 = new Student("Patrick", 25, 2.0);
        Student student3 = new Student("Sandy", 27, 4.0);

        student1.study();
        student2.study();
        student3.study();

         */

        // Overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists
        //                           Enable objects to be initialized in different ways

        User user1 = new User("Squidward");
        User user2 = new User("Patrick", "pstar@aol.com"); // overloaded with second constructors
        User user3 = new User("Sandy", "SCheeks@gmail.com", 27); // overloaded with third constructors
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
