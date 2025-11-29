public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10,000.00 at " + rate + "% interest = " + calculateInterest(10000.0, rate));
        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            System.out.println("100.00 at " + rate + "% interest = " + calculateInterest(100.0, rate));
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * (rate / 100);
    }
}