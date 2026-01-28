public class Main {

    public static void main(String[] args) {
//        RegularBurger regularBurger = new RegularBurger();
//        System.out.println(regularBurger.getFullPrice() + " denari");
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        System.out.println(deluxeBurger.getFullPrice() + " denari");

//        DeluxeBurger deluxeBurger = new DeluxeBurger();1

//        MealOrder order = MealOrder.createFromUserInput();
//        System.out.println("Total price: " + order.getTotalPrice() + " denari");

        BasicMealOrder order = new BasicMealOrder();
        System.out.println("Total price: " + order.getTotalPrice() + " denari");

        DeluxMealOrder deluxOrder = new DeluxMealOrder();
        System.out.println("Total price: " + deluxOrder.getTotalPrice() + " denari");
    }
}