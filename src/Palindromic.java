public class Palindromic {

    public static void main(String[] args) {
        if(isPalindrome(121)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(int number) {
        return reverseNumber(number) == number;
    }

    public static int reverseNumber(int x) {
        int reverse = 0;
        boolean isNegative = x < 0;
        if (isNegative) {
            x *= -1;
        }

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        if (isNegative) {
            reverse *= -1;
        }

        return reverse;
    }
}