import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {

    // ArrayList = A resizeable array that stores objects (autoboxing).
    //             Arrays are fixed in size, but ArrayLists can change size.

    public static void arrayList() {
        /*
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

         */
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Coconut");
        fruits.add("Orange");

        // fruits.remove(1);
        // fruits.set(0, "Pineapple");

        // System.out.println(fruits);
        // System.out.println(fruits.get(1));
        // System.out.println(fruits.size());

        Collections.sort(fruits);
        // System.out.println(fruits); // After sorting, the list will be sorted alphabetically

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        System.out.print("Enter the # of fruits you want to add: ");
        int fruitCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= fruitCount; i++) {
            System.out.print("Enter favourite fruit #" + i + ": ");
            String fruitInput = scanner.nextLine();
            fruits.add(fruitInput);
        }

        /*
        // Alternative Method
        do {
            System.out.print("Enter your favorite fruit: ");
            String fruitInput = scanner.nextLine();
            fruits.add(fruitInput);
            System.out.println("Fruit added successfully!");
        } while (fruits.size() < fruitCount);
         */

        System.out.println("Here are your favorite fruits:");
        Collections.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }

}
