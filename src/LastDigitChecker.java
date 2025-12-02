public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123, 3, 3));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) return false;

        int lastDigitA =  a % 10;
        int lastDigitB =  b % 10;
        int lastDigitC =  c % 10;

        return (lastDigitA == lastDigitB)
                || (lastDigitA == lastDigitC)
                || (lastDigitB == lastDigitC);
    }

    public static boolean isValid(int x) {
        return x >= 10 && x <= 1000;
    }
}
