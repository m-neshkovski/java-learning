public class NextMain {
    public static void main(String[] args) {
        Movie newMovie = Movie.getMovie("A", "Jaws");
        newMovie.watchMovie();

        Adventure adventureMovie = (Adventure) Movie.getMovie("A", "Jaws");
        adventureMovie.watchMovie();
    }
}
