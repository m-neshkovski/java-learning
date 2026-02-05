package dev.mn;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
        String[] splitStrings = "Hello World Again".split(" ");

        printText(splitStrings);


        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello World", "Again");

        System.out.println("-".repeat(20));
        printText();

        System.out.println("-".repeat(20));
        String[] sArray = {"Hello", "World"};
        System.out.println(String.join(",", sArray));

        System.out.println("-".repeat(20));
        System.out.println(String.join(",", "Hello", "World"));
    }

    // Variable argument, should be only one and a last element
    private static void printText(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }
}
