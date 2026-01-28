import java.util.Scanner;

public class Burger {
    private String type;
    private double basePrice;
    private BurgerToppings toppings;

    public Burger(String type, double basePrice, int maxToppings) {
        this.type = type;
        this.basePrice = basePrice;
        toppings = new BurgerToppings(maxToppings);
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public static Burger createFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a burger type: ");
        System.out.println("1 - Regular, 2 - Deluxe");

        if (Integer.parseInt(scanner.nextLine()) == 2) {
            return new DeluxeBurger();
        }

        return new RegularBurger();
    }

    public double getFullPrice() {
        return basePrice + toppings.getPrice();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", basePrice=" + basePrice +
                ", toppings=" + toppings +
                '}';
    }
}

class RegularBurger extends Burger {
    public RegularBurger() {
        super("regular", 250.0, 3);
    }
}

class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("deluxe", 300.0, 5);
    }

    @Override
    public double getFullPrice() {
        return getBasePrice();
    }
}


