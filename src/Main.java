public class Main {

    public static void main(String[] args) {
        int currentYear = 2025;
//        String userDateOfBirth = "1983";
//
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hello, " + name + ", Thanks for joining us!");

        String dateOfBirth = System.console().readLine("What is your date of birth? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}