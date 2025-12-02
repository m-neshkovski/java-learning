public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(36, 35, 34) ? "Yes" : "No");
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (! isValid(a) || ! isValid(b) || ! isValid(c)) return false;

        a %= 10;
        b %= 10;
        c %= 10;

        return (a == b) || (a == c) || (b == c);
    }

    public static boolean isValid(int x) {
        return x >= 10 && x <= 1000;
    }
}
