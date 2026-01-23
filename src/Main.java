public class Main {

    public static void main(String[] args) {
        printInformation("Hello World!");
        printInformation("");
        printInformation("\t     \n");

        // String inspection methods

        String helloWorld = "Hello World!";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("Index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("Index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        // Comparison Methods
        // contentEquals, equals, equalsIgnoreCase
        // contains, endsWith, startsWith, regionMatches

        String helloWorldToLowerCase = helloWorld.toLowerCase();
        System.out.println(helloWorldToLowerCase);

        if (helloWorld.equals(helloWorldToLowerCase)) {
            System.out.println("Strings match exactly.");
        }

        if (helloWorld.equalsIgnoreCase(helloWorldToLowerCase)) {
            System.out.println("Strings match ignoring case.");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello.");
        }

        if (helloWorld.endsWith("World!")) {
            System.out.println("String ends with World!.");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World.");
        }

        if (helloWorld.contentEquals("Hello World!")) {
            System.out.println("Strings match exactly.");
        }

        // Strong manipultion methods
        // indent, strip, stripLeading, stripTrailing, toLowerCase, toUpperCase
        // concat, join, repeat, replace, replaceAll, replaceFirst, substring, subSequence


    }

    public static void printInformation(String string) {
        int length = string.length();

        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank.");
        }

        System.out.printf("First character = %c %n", string.charAt(0));
        System.out.printf("Last character = %c %n", string.charAt(length -1));
    }
}