import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];

        // Same reference, no new keyword
        int[] myArray2 = myArray;

//        System.out.println("Ref: " + myArray + " Value: " + Arrays.toString(myArray));
//        System.out.println("Ref: " + myArray2 + " Value: " + Arrays.toString(myArray2));

        printArray(myArray);
        printArray(myArray2);

        myArray[0] = 10;

        printArray(myArray);
        printArray(myArray2);

        Simple simple = new Simple(10);
        Simple simple1 = new Simple(15);

//        System.out.println(simple.toString());

        Simple[] simpleArray = new Simple[2];
        Simple[] simpleArray2 = simpleArray;

        simpleArray[0] = simple;
        simpleArray[1] = simple1;

        System.out.println(Arrays.toString(simpleArray));
        System.out.println(Arrays.toString(simpleArray2));

        simpleArray2[0].setArg(20);
        System.out.println(Arrays.toString(simpleArray));
        System.out.println(Arrays.toString(simpleArray2));
    }

    private static void printArray(int[] array) {
        System.out.println("Ref: " + array + " Value: " + Arrays.toString(array));
    }
}