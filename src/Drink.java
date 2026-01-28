import java.util.Scanner;

public class Drink {
    private String type;
    private DrinkSize size;
    private double price;

    public Drink(String type, int sizeId, double price) {
        this(type, DrinkSize.factory(sizeId), price);
    }

    public Drink(String type) {
        this(type, 1, 0.0);
    }

    public Drink(String type, DrinkSize size) {
        this(type, size, 0.0);
    }

    public Drink(String type, DrinkSize size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public Drink() {
        this("Not selected", 1, 0.0);
    }

    public String getType() {
        return type;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(DrinkSize size) {
        this.price = this.getPrice();
    }

    public static Drink createFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a drink: ");
        System.out.println("1 - Coke, 2 - Water, 3 - IceTee, 0 - None");

        int drinkId = Integer.parseInt(scanner.nextLine());

        DrinkSize size = DrinkSize.createFromUserInput();

        return factory(drinkId, size);
    }

    public static Drink factory(int id, DrinkSize size) {
        return switch (id) {
            case 1 -> new Coke(size);
            case 2 -> new Water(size);
            case 3 -> new IceTee(size);
            default -> new Drink();
        };
    }
}

class Coke extends Drink {
    public Coke(DrinkSize size) {
        super("Coke", size);
        setPrice(size);
    }

    @Override
    public void setPrice(DrinkSize size) {
        switch (size.getId()) {
            case 1 -> setPrice(80.0);
            case 2 -> setPrice(100.0);
            case 3 -> setPrice(120.0);
            default -> setPrice(0.0);
        }
    }
}

class Water extends Drink {
    public Water(DrinkSize size) {
        super("Water", size);
        setPrice(size);
    }

    @Override
    public void setPrice(DrinkSize size) {
        switch (size.getId()) {
            case 1 -> setPrice(60.0);
            case 2 -> setPrice(70.0);
            case 3 -> setPrice(80.0);
            default -> setPrice(0.0);
        }
    }
}

class IceTee extends Drink {
    public IceTee(DrinkSize size) {
        super("IceTee", size);
        setPrice(size);
    }

    @Override
    public void setPrice(DrinkSize size) {
        switch (size.getId()) {
            case 1 -> setPrice(80.0);
            case 2 -> setPrice(90.0);
            case 3 -> setPrice(100.0);
            default -> setPrice(0.0);
        }
    }
}


