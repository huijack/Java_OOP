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

        /*
        // Overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists
        //                           Enable objects to be initialized in different ways

        /*
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

         */

        /*
        Car_v2 car1 = new Car_v2("Civic", "White");
        Car_v2 car2 = new Car_v2("Corvette", "Black");
        Car_v2 car3 = new Car_v2("Golf", "Red");

        // Create an array of cars
        Car_v2[] cars = {car1, car2, car3};

        for (Car_v2 car : cars) {
            car.drive();
        }

         */

        /*
        // or we can initialize the cars in the same line (anonymous objects)
        Car_v2[] cars = {new Car_v2("Civic", "White"),
                         new Car_v2("Corvette", "Black"),
                         new Car_v2("Golf", "Red")};

        for (Car_v2 car : cars) {
            car.color = "Blue";
            car.drive();
        }

         */

        /*
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Max");

        System.out.println(Friend.numOfFriends); // Better to call the class name directly for static variables

        Friend.showFriends();

         */

        /*
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // Inherit from parent class
        dog.eat();
        cat.eat();

        // Methods from child class
        dog.speak();
        cat.speak();

        // Inherits from grandparent class
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        plant.photosynthesize();

         */

        /*
        Person person = new Person("Tom", "Riddle");
        Student_v2 student = new Student_v2("Harry", "Potter", 4.0);
        Employee employee = new Employee("Ron", "Weasley", 50000);

        person.showName();
        student.showName();

        student.showGPA();

        employee.showSalary();

         */

        /*
        Dog_v2 dog = new Dog_v2();
        Cat_v2 cat = new Cat_v2();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

         */

        Object object = new Object();
        System.out.println(object); // In normal circumstances, this will return object memory address

        Car_v3 car1 = new Car_v3("Ford", "Mustang", 1964, "Red");
        Car_v3 car2 = new Car_v3("Tesla", "Model S", 2018, "White");

        System.out.println(car1); // Able to display strings because toString method is overriden
        System.out.println(car2);

    }
}
