import java.util.Scanner;

public class MealOrder {

    private MenuItem burger;
    private MenuItem drink;
    private MenuItem sideItem;

    public MealOrder (MenuItem burger, MenuItem drink, MenuItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public static MealOrder createFromUserInput() {
        MenuItem burger = Burger.createFromUserInput();
        MenuItem drink = Drink.createFromUserInput();
        MenuItem sideItem = SideItem.createFromUserInput();

        return new MealOrder(burger, drink, sideItem);
    }

    public double getPrice() {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }

    public void printItem() {
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.println("-".repeat(30));
        MenuItem.printItem("ORDER TOTAL PRICE", getPrice());
    }

    public static void startOrdering() {
        Scanner scanner = new Scanner(System.in);

        double dailyEarnings = 0.0;

        do {
            MealOrder.printMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) break;
            MealOrder order = MealOrder.factory(choice);
            dailyEarnings += order.getPrice();
            order.printItem();
            System.out.println("-".repeat(40));
            System.out.println("1 - New Meal Order | 0 - Exit");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) break;
        } while (true);

        System.out.println("Daily Earnings: " + dailyEarnings + " denari.");
    }

    public static void printMenu() {
        System.out.println("Welcome to the Burger House!");
        System.out.println("-".repeat(40));
        System.out.println("Choose Meal Order: ");
        System.out.println("1 - Basic Meal Order (Regular Burger, Small Coke, Fries)");
        System.out.println("2 - Deluxe MealOrder (Deluxe Burger, Large Coke, Fries)");
        System.out.println("3 - Custom Meal Order");
        System.out.println("0 - Exit");
    }

    public static MealOrder factory(int id) {
        return switch (id) {
            case 1 -> new BasicMealOrder();
            case 2 -> new DeluxeMealOrder();
            default -> MealOrder.createFromUserInput();
        };
    }
}

class BasicMealOrder extends MealOrder {
    public BasicMealOrder() {
        super(new RegularBurger(), Drink.factory(1, DrinkSize.factory(1)), SideItem.factory(1));
    }
}

class DeluxeMealOrder extends MealOrder {
    public DeluxeMealOrder() {
        super(new DeluxeBurger(), Drink.factory(1, DrinkSize.factory(3)), SideItem.factory(1));
    }
}
