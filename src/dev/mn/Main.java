package dev.mn;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] randomArray = {7, 30, 3, 35};
//        int[] randomArray = getRandomIntArray(10);
        int[] randomArray = getIntegers(3);

        printArrayWithArrays(randomArray);
        randomArray = sortIntArrayDesc(randomArray);
        printArrayWithArrays(randomArray);

        printArray(randomArray);

    }

    private static int[] getRandomIntArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    private static void printArrayWithArrays(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] sortIntArrayDesc(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean isNotSorted = true;
        int temp;

        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isNotSorted = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }

    private static int[] getIntegers(int length) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("Enter element %d: \n\r", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contains %d\n", i, array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean isNotSorted = true;
        int temp;

        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isNotSorted = true;
                }
            }
        }

        return sortedArray;
    }
}
