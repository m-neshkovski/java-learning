public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        for (int i = 400; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                counter++;
                sum += i;
                System.out.println("Found: " + i + " as match no. " + counter + ". Current sum when added is: " + sum);
            }
            if (counter == 5) break;
        }
        System.out.println("Sum of all (" + counter + ") numbers devisable by 3 and 5 is: " + sum);
    }
}