import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("ScienceFiction", "The Matrix");
        movie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter movie type (A, C, S or Q): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title: ");
            Movie newMovie = Movie.getMovie(type, scanner.nextLine());
            newMovie.watchMovie();
        }
    }
}