package dev.mn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = readInteger();
        System.out.println("n = " + n);

        int[] array = readIntegers();

        System.out.println(Arrays.toString(array));

        int min = findMin(array);
        System.out.println("min = " + min);

        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter comma delimited list of integers: ");
        String commaDelimitedIntegers = scanner.nextLine();

        // Validation maybe

        String[] tempArray = commaDelimitedIntegers.split(",");

        int[] intArray = new int[tempArray.length];

        for (int i = 0; i < tempArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(tempArray[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input on position " + i + " \"" + tempArray[i] + "\". Please enter comma delimited list of only integers.");
                System.exit(1);
            }
        }

        return intArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] readElements(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = readInteger();
        }
        return array;
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value: ");

        try {

            return Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Error!!! Enter integer value: ");
            return readInteger();
        }
    }

    private static void reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
