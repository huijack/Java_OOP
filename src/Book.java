public class Book {

    // Aggregation = Represents a "has-a" relationship between objects.
    //               One object contains another object as part of its structure,
    //               but the contained object/s can exist independently.

    private final String title;
    private final int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }
}
