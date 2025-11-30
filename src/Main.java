public class Main {

    public static void main(String[] args) {
        int primeCount = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println(i + " ---> " + primeCount);
                if (primeCount == 3) break;
            }
//            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "prime number.");
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 1) return false;

        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}