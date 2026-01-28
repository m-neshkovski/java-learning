import java.util.Scanner;

public class Topping {

    private String type;
    private double price;

    public Topping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Topping() {
        type = "Not selected";
        price = 0.0;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public static Topping createFromUserInput() {

        Scanner scanner = new Scanner(System.in);

        printMenu();

        return factory(scanner.nextInt());
    }

    public static void printMenu() {
        System.out.println("Topping menu:");
        System.out.println("1 -> Ketchup (10 denari) | 2 -> Mayonnaise (10 denari) | 3 -> Mustard (10 denari)");
        System.out.println("4 -> Onion (10 denari) | 5 -> Pickle (20 denari) | 6 -> Pepperoni (20 denari)");
        System.out.println("7 -> Cheese (20 denari) | 0 -> No more toppings");
        System.out.println();
    }

    public static Topping factory(int id) {
        // Simulate that toppings are in the DB table
        return switch (id) {
            case 1 -> new Ketchup();
            case 2 -> new Mayonnaise();
            case 3 -> new Mustard();
            case 4 -> new Onion();
            case 5 -> new Pickle();
            case 6 -> new Pepperoni();
            case 7 -> new Cheese();
            default -> new Topping();
        };
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type='" + type + '\'' +
                ", price=" + price +
                "}\n";
    }
}

class Ketchup extends Topping {
    public Ketchup() {
        super("Ketchup", 10.0);
    }
}

class Mayonnaise extends Topping {
    public Mayonnaise() {
        super("Mayonnaise", 10.0);
    }
}

class Mustard extends Topping {
    public Mustard() {
        super("Mustard", 10.0);
    }
}

class Onion extends Topping {
    public Onion() {
        super("Onion", 20.0);
    }
}

class Pickle extends Topping {
    public Pickle() {
        super("Pickle", 20.0);
    }
}

class Pepperoni extends Topping {
    public Pepperoni() {
        super("Pepperoni", 20.0);
    }
}

class Cheese extends Topping {
    public Cheese() {
        super("Cheese", 50.0);
    }
}