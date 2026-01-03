public class Movie {

    private final String title;
    private final int year;
    private double rating;
    public static final double MIN_RATING = 0.0;
    public static final double MAX_RATING = 5.0;

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        if (rating < MIN_RATING || rating > MAX_RATING) {
            System.out.println("Rating must be between 0.0 and 5.0.");
        } else {
            this.rating = rating;
        }
    }

    String showInfo() {
        return String.format("%s (%d) has a rating of %.1f", this.title, this.year, this.rating);
    }
}
