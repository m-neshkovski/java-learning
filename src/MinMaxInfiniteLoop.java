import java.util.Scanner;

public class MinMaxInfiniteLoop {
    public static void main(String[] args) {
        double minNumber = Double.MAX_VALUE;
        double maxNumber = Double.MIN_VALUE;

        do {
            try {
                double input = Double.parseDouble(getInputFromConsole("Enter next number to compare or string to quit > "));
                if (input < minNumber) {minNumber = input;}
                if (input > maxNumber) {maxNumber = input;}
            } catch (NumberFormatException e) {
                if(minNumber == Double.MAX_VALUE && maxNumber == Double.MIN_VALUE) {
                    System.out.println("No valid number is entered!");
                    break;
                }
                System.out.println("Final result is: Min: " +  minNumber + " Max: " + maxNumber);
                break;
            }
        } while (true);


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
