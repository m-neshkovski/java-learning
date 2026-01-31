import java.util.Scanner;

public class DrinkSize {

    private static final Scanner scanner = new Scanner(System.in);

    private int id;
    private String name;

    public DrinkSize(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static DrinkSize factory(int id) {
        return switch (id) {
            case 2 -> new MediumDrinkSize();
            case 3 -> new LargeDrinkSize();
            default -> new SmallDrinkSize();
        };
    }

    public static DrinkSize createFromUserInput() {
        System.out.println("Choose drink size: ");
        System.out.println("1 - Small, 2 - Medium, 3 - Large (Default is Small)");

        return factory(Integer.parseInt(scanner.nextLine()));
    }
}

class SmallDrinkSize extends DrinkSize {
    public SmallDrinkSize() {
        super(1,"Small");
    }
}

class MediumDrinkSize extends DrinkSize {
    public MediumDrinkSize() {
        super(2,"Medium");
    }
}

class LargeDrinkSize extends DrinkSize {
    public LargeDrinkSize() {
        super(3,"Large");
    }
}


