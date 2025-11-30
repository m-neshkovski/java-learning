public class Main {

    public static void main(String[] args) {
        int i = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (i <= 20) {
            i++;
            if (! isEvenNumber(i)) {
                oddCount++;
                continue;
            }
            System.out.println(i);
            evenCount++;
            if (evenCount >= 5) break;
//            i++;
        }
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return (number >= 0) && (number % 2 == 0);
    }
}