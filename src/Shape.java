public abstract class Shape {

    // abstract = Used to define abstract classes and methods
    //            Abstraction is the process of hiding implementation details
    //            and showing only the essential features;
    //            Example: When teaching someone to drive, you don't explain every car components
    //            Instead just inform users that brake pedal to stop, and gas pedal to drive
    //            Abstract classes CAN'T be instantiated directly
    //            Can contain 'abstract' methods (which must be implemented)
    //            Can contain 'concrete' methods (which are inherited)

    abstract double area(); // ABSTRACT

    void display() { // CONCRETE
        System.out.println("This is a shape");
    }
}
