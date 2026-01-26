public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " has lost the game!");
        }
    }
    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if (health > 100) {
            System.out.println("Health restored to 100%");
            health = 100;
        }
    }
}
