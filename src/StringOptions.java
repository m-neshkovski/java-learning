public class StringOptions {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World!";
        helloWorld.concat(" And Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World!");
        helloWorldBuilder.append(" And Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyBuilder = new StringBuilder();
        emptyBuilder.append("a".repeat(17));

        StringBuilder emptyBuilder32 = new StringBuilder(32);
        emptyBuilder32.append("a".repeat(17));

        printInformation(emptyBuilder);
        printInformation(emptyBuilder32);

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
