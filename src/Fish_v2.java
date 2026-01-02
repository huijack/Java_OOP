public class Fish_v2 implements Prey, Predator{ // implements 2 interfaces

    @Override
    public void flee() {
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");
    }
}
