public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("GCD = " + getGreatestCommonDivisor(17, 13));
        System.out.println("GCD = " + getGreatestCommonDivisor(9, 19));
        System.out.println("GCD = " + getGreatestCommonDivisor(21647, 1561649));
        System.out.println("GCD = " + getGreatestCommonDivisor(-11, 11));
        System.out.println("GCD = " + getGreatestCommonDivisor(10, 10));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int i = first > second ? second : first;

        do {
            System.out.println(i);
            if (first % i == 0 && second % i == 0) return i;
            i--;
        } while (i > 1);

        return 1;
    }
}
