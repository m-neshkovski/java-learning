public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int sheetsPrinted = printer.printPages(100);

        System.out.println("Sheets printed = " + sheetsPrinted);
        System.out.println("Current page count = " + printer.getPagesPrinted());

        sheetsPrinted = printer.printPages(5);

        System.out.println("Sheets printed = " + sheetsPrinted);
        System.out.println("Current page count = " + printer.getPagesPrinted());
    }
}