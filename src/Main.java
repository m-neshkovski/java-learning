import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currentYear = 2025;
//        String userDateOfBirth = "1983";
//
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hello, " + name + ", Thanks for joining us!");

        String dateOfBirth = System.console().readLine("What is your date of birth? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        // To read from console
        Scanner scanner = new Scanner(System.in);

        // To read from a file
//        Scanner fileScanner = new Scanner(new File ("nameOfFileOnFileSystem"));

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + ", Thanks for joining us!");

        System.out.println("What is your date of birth? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear + ".");
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age != -1;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed. Please enter a valid year.");
            }
        } while (!validDOB);



        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if (dob < minYear || dob > currentYear) return -1;

        return currentYear - dob;
    }
}