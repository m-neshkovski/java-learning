public class SharedDigit {


    public static void main(String[] args) {

        if (hasSharedDigit(12, 23)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) return false;

        while (a > 0) {
            int digitA = a % 10;
            a /= 10;
            int x = b;
            while (x > 0) {
                int digitB = x % 10;
                if (digitA == digitB) return true;
                x /= 10;
            }

        }

        return false;
    }
}
