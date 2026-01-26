public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player();
//
//        player1.name = "Player 1";
//        player1.health = 100;
//        player1.weapon = "Sword";
//
//        player1.looseHealth(20);
//        System.out.println(player1.healthRemaining());
//
//        player1.looseHealth(81);
//        System.out.println(player1.healthRemaining());
//
//        // Problem if the encapsulation is week!!!
//        // health should not be more than 100. that is why we want to encapsulate it in methods
//        player1.health = 200;
//        System.out.println(player1.healthRemaining());
//        // The next line will fix this
//        player1.restoreHealth(30);
//        System.out.println(player1.healthRemaining());


        EnhancedPlayer player2 = new EnhancedPlayer("Player 2");
        System.out.println(player2.healthRemaining());
    }
}