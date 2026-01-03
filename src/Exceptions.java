import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    // Exception = An event that interrupts the normal flow of a program.
    //             (Dividing by zero, file not found, mismatch input type)
    //             (Surround any dangerous code with try-catch block)
    //             try{}, catch(Exception e){}, finally{}

    public static void exceptions() {

        /*
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }

         */

        // BETTER APPROACH (Resource Management)
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            // SAFETY NET
            System.out.println("Invalid input! Please enter a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            // ALWAYS EXECUTES REGARDLESS OF THE EXCEPTION
            System.out.println("This always executes.");
        }

        /*
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            // SAFETY NET
            System.out.println("Invalid input! Please enter a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            // ALWAYS EXECUTES REGARDLESS OF THE EXCEPTION
            scanner.close();
            System.out.println("This always executes.");
        }

         */
    }

}
