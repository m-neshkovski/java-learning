public class Main {

    public static void main(String[] args) {

        printFinalScore(
                calculateScore(true, 800, 5, 100)
        );

        printFinalScore(
                calculateScore(true, 10000, 8, 200)
        );

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver) {

            finalScore += bonus * levelCompleted;
        }

        return finalScore;
    }

    public static void printFinalScore(int finalScore) {
        System.out.println("Your final score was: " + finalScore);
    }
}