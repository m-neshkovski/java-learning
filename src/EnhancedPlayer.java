public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health > 100) {
            this.healthPercentage = 100;
        } else if (health <= 0) {
            this.healthPercentage = 1;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            System.out.println(fullName + " has lost the game!");
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Health restored to 100%");
            healthPercentage = 100;
        }
    }
}
