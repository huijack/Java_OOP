public class StreamingPlatform {

    private final String name;
    Movie[] movies;

    StreamingPlatform(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    void showInfo() {
        System.out.printf("Streaming Platform: %s \n", this.name);
        System.out.println("Movies available:");
        for (Movie movie : movies) {
            System.out.println(movie.showInfo());
        }
    }
}
