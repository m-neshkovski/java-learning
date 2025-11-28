public class MainSecond {
    // resenie na challenge section 5.48
    public static void main(String[] args) {
        displayHighScorePosition("Bob0", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob1", calculateHighScorePosition(1000));
        displayHighScorePosition("Bob2", calculateHighScorePosition(500));
        displayHighScorePosition("Bob3", calculateHighScorePosition(100));
        displayHighScorePosition("Bob4", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get in position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }
}