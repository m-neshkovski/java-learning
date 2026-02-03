package dev.mn;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);

        printArray(firstArray);

        Arrays.sort(firstArray);

        printArray(firstArray);

        int[] secondArray = new int[10];
        printArray(secondArray);
        Arrays.fill(secondArray, 5);
        printArray(secondArray);

        int[] thirdArray = getRandomArray(10);
        printArray(thirdArray);

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        printArray(fourthArray);

        Arrays.sort(fourthArray);
        printArray(thirdArray);
        printArray(fourthArray);

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        printArray(smallerArray);

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        printArray(largerArray);

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Mark is in the array");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        int[] s3 = {5, 2, 3, 4, 1};
        int[] s4 = {1, 2, 3, 4, 5, 0};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        };

        if (Arrays.equals(s1, s3)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        };

        if (Arrays.equals(s1, s4)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        };
    }

    private static int[] getRandomArray(int length) {

        Random random = new Random();
        int[] newIntArray = new int[length];

        for (int i = 0; i < length; i++) {
            newIntArray[i] = random.nextInt(100);
        }

        return newIntArray;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
