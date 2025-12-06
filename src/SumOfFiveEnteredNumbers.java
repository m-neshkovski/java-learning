import java.util.Scanner;

public class SumOfFiveEnteredNumbers {
    public static void main(String[] args) {
//        System.out.println(getValidIntegerInputFromConsole("Enter number: "));
        printSumOfFiveNumbers();
    }

    public static void printSumOfFiveNumbers() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += getValidIntegerInputFromConsole("Enter number #" + i + ": ");
        }
        System.out.println("Sum of 5 entered numbers in console is " + sum);
    }

    public static int getValidIntegerInputFromConsole(String message) {
        boolean isValid = false;
        int number = 0;

        do {
            try {
                number = Integer.parseInt(getInputFromConsole(message));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer. [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
            }
        } while (!isValid);

        return number;
    }

    public static String getInputFromConsole(String message) {
        try {
            return System.console().readLine(message);
        } catch (NullPointerException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextLine();
        }
    }
}