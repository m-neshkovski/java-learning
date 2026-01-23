public class Main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;

        System.out.println(textBlock);

        int age = 35;

        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2026 - age;

        System.out.printf("Your year of birth is %d, age is %d%n", yearOfBirth, age);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formatedString = String.format("Your age is %d", age);
        System.out.println(formatedString);

        formatedString = "Your age is %d".formatted(age);
        System.out.println(formatedString);
    }
}