public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234)  + " - " + sumDigitsDoWhile(1234)  + " - " + sumDigitsRecursion(1234));
        System.out.println(sumDigits(-125)  + " - " + sumDigitsDoWhile(-125)  + " - " + sumDigitsRecursion(-125));
        System.out.println(sumDigits(4)  + " - " + sumDigitsDoWhile(4)  + " - " + sumDigitsRecursion(4));
        System.out.println(sumDigits(32123)  + " - " + sumDigitsDoWhile(32123)  + " - " + sumDigitsRecursion(32123));
        System.out.println(sumDigits(0)  + " - " + sumDigitsDoWhile(0)  + " - " + sumDigitsRecursion(0));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;

        int sum = 0;

        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }

        sum += number;

        return sum;
    }

    public static int sumDigitsDoWhile(int number) {
        if (number < 0) return -1;

        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        return sum;
    }

    public static int sumDigitsRecursion(int number) {
        if (number < 0) return -1;
        if (number < 10) return number;
        return number % 10 + sumDigitsRecursion(number / 10);
    }
}