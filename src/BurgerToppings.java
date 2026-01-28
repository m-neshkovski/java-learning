import java.util.Scanner;

public class BurgerToppings {
    // Simulate list
    private Topping topping1 = new Topping();
    private Topping topping2 = new Topping();
    private Topping topping3 = new Topping();
    private Topping topping4 = new Topping();
    private Topping topping5 = new Topping();

    public BurgerToppings(int maxToppings) {

        Scanner scanner = new Scanner(System.in);
        int nextTopping = 1;

        Topping.printMenu();

        do {
            System.out.println("Choice Topping no. " + nextTopping + ":");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                do {
                    nextTopping = addTopping(nextTopping, new Topping());
                } while (nextTopping <= maxToppings);
                break;
            }

            nextTopping = addTopping(nextTopping, Topping.factory(choice));
        } while (nextTopping <= maxToppings);

        System.out.println("Total price of toppings: " + getPrice());
    }

    public int addTopping(int nextTopping, Topping topping) {
        switch (nextTopping) {
            case 1: topping1 = topping; break;
            case 2: topping2 = topping; break;
            case 3: topping3 = topping; break;
            case 4: topping4 = topping; break;
            case 5: topping5 = topping; break;
            default: break;
        }

        System.out.println("Topping " + nextTopping + " -> " +  topping.getType() + "(" + topping.getPrice() + ")");

        return nextTopping + 1;
    }

    public double getPrice() {
        return topping1.getPrice() + topping2.getPrice() + topping3.getPrice() + topping4.getPrice() + topping5.getPrice();
    }

    @Override
    public String toString() {
        return "BurgerToppings{" +
                "topping1=" + topping1 +
                ", topping2=" + topping2 +
                ", topping3=" + topping3 +
                ", topping4=" + topping4 +
                ", topping5=" + topping5 +
                '}';
    }
}
