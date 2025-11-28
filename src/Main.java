public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
    }

    // 1 inch = 2.54cm, 1 foot = 12 inches

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(feet * 12 + inches);
    }
}