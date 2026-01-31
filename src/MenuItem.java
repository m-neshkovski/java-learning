import java.util.Scanner;

public class MenuItem {

    protected static Scanner scanner = new Scanner(System.in);

    private String type;
    private double price;

    public MenuItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printItem() {
        printItem(this.getType().toUpperCase(), this.getPrice());
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s: %6.2f%n", name, price);
    }
}
