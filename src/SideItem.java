public class SideItem extends MenuItem {

    public SideItem(String type, double price) {
        super(type, price);
    }

    public SideItem() {
        super("Not selected", 0.0);
    }

    public static SideItem createFromUserInput() {
        System.out.println("Choose a SideItem: ");
        System.out.println("1 - Fries (40 denari), 2 - Salad (30 denari), 0 - None");

        return factory(Integer.parseInt(scanner.nextLine()));
    }

    public static SideItem factory(int id) {
        return switch (id) {
            case 1 -> new Fries();
            case 2 -> new Salad();
            default -> new SideItem();
        };
    }
}

class Fries extends SideItem {
    public Fries() {
        super("Fries", 40.0);
    }
}

class Salad extends SideItem {
    public Salad() {
        super("Salad", 30.0);
    }
}