public class Fish extends Animal_v2 {

    // It's good to put this to let u/devs know that the method is being overridden
    // Also helps to detect error if misspelled
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
