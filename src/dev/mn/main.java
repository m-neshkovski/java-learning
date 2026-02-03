package dev.mn;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myIntArray[2]);

        // This is normal initialization
        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        // This is an anonymous initialization and can be used only in a declaration statement
        int[] firstFivePositivesAnonymous = {1, 2, 3, 4, 5};

        int firstTenPositives[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(firstTenPositives[5]);
        int length = firstTenPositives.length;
        System.out.println("Array length = " + length);
        System.out.println("Array last element = " + firstTenPositives[length - 1]);

        int[] newArray;
        // This is not possible
//        newArray = {5, 4, 3, 2, 1};
//        this is possible
        newArray = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }

        // Equal to foreach in PHp
        for (int j : newArray) {
            System.out.print(j + ", ");
        }

        int[] newTestArray = new int[5];

        int index = 0;
        for (int j : newTestArray) {
            newTestArray[index] = newTestArray.length - index;
            index++;
        }

        System.out.println();
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");
//        }

        System.out.println(Arrays.toString(newTestArray));

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newTestArray;
        System.out.println(objectArray[2].getClass());
    }
}
