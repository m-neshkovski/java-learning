public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public static MealOrder createFromUserInput() {
        // Choose a burger
        Burger burger = Burger.createFromUserInput();
        // Choose a drink
        Drink drink = Drink.createFromUserInput();
        // Choose a side item
        SideItem sideItem = SideItem.createFromUserInput();

        return new MealOrder(burger, drink, sideItem);
    }

    public double getTotalPrice() {
        return burger.getFullPrice() + drink.getPrice() + sideItem.getPrice();
    }
}

class BasicMealOrder extends MealOrder {
    public BasicMealOrder() {
        super(new RegularBurger(), Drink.factory(1, DrinkSize.factory(1)), SideItem.factory(1));
    }
}

class DeluxMealOrder extends MealOrder {
    public DeluxMealOrder() {
        super(new DeluxeBurger(), Drink.factory(1, DrinkSize.factory(3)), SideItem.factory(1));
    }
}
