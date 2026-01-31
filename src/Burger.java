public class Burger extends MenuItem {

    private double basePrice;

    private BurgerToppings toppings;

    public Burger(String type, double price, int maxToppings) {
        super(type, price);
        basePrice = price;
        toppings = new BurgerToppings(maxToppings);
    }

    public BurgerToppings getToppings() {
        return toppings;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public static Burger createFromUserInput() {
        System.out.println("Choose a burger type: ");
        System.out.println("1 - Regular, 2 - Deluxe");

        if (Integer.parseInt(scanner.nextLine()) == 2) {
            return new DeluxeBurger();
        }

        return new RegularBurger();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + super.getType() + '\'' +
                ", basePrice=" + super.getPrice() +
                ", toppings=" + toppings +
                '}';
    }

    @Override
    public void printItem() {
        MenuItem.printItem("BASE BURGER", this.getBasePrice());
        toppings.printItem();
        System.out.println("-".repeat(30));
        MenuItem.printItem(this.getType().toUpperCase() + " BURGER", getPrice());
    }
}

class RegularBurger extends Burger {
    public RegularBurger() {
        super("regular", 250.0, 3);
        this.setPrice(this.getToppings());
    }

    public void setPrice(BurgerToppings toppings) {
        super.setPrice(super.getPrice() + toppings.getPrice());
    }
}

class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("deluxe", 300.0, 5);
    }

    @Override
    public void printItem() {
        MenuItem.printItem(this.getType().toUpperCase() + " BURGER", this.getPrice());
    }
}


