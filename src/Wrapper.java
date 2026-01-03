public class Wrapper {

    // Wrapper classes = Allows primitive values (int, char, double, boolean)
    //                   to be used as objects. "Wrap them in an object"
    //                   Generally, don't wrap primitives unless you need to
    //                   Allows user of Collections Framework and static Utility Methods

    public static void wrapper() {

        // OLD WAY
        /*
        Integer a = new Integer(123); // Deprecated as of Java 9
        Double b = new Double(123.456);
        Character c = new Character('A');
        Boolean d = new Boolean(true);

         */

        /*
        // MODERN WAY (Autoboxing)
        Integer a = 123;
        Double b = 123.456;
        Character c = 'A';
        Boolean d = true;

        // Unboxing (Convert object back to primitive)
        int x = a;
        double y = b;
        char z = c;
        boolean q = d;

         */

        // Wrapper Example
        /*
        String aa = Integer.toString(123);
        String bb = Double.toString(3.14);
        String cc = Character.toString('A');
        String dd = Boolean.toString(true);

        String xx = aa + bb + cc + dd;

        System.out.println(xx);

         */

        /*
        // Wrapper Example (Parsing)
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

         */


        char letter = 'B';
        boolean isCapital;

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
