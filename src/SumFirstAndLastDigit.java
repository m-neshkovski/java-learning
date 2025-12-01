public class SumFirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123456789));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        if (number < 10) return number * 2;

        int sum = number % 10;

        do {
            number /= 10;
        } while (number >= 10);

        return sum + number;
    }
}
