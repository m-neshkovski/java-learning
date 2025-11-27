public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Milosh!");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am still alive!");
        }

        int topScore = 80;

        if (topScore == 100) {
            System.out.println("You are the best!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if(topScore > 90 || secondTopScore <= 90) {
            System.out.println("Top score is greater than 90 or second top score is less than or equal to 90");
        }

        int newValue = 10;
        if (newValue == 10) {
            System.out.println("The value is 10");
        }

        boolean isTrue = true;
        if (isTrue) {
            System.out.println("The value is true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? true : false;

        double a = 20.0;
        double b = 80.0;
        double c = (a + b) * 100.00;

        System.out.println("(a + b) * 100.00 = " + c);
        System.out.println("c % 40.00 = " + (c % 40.00) );

        boolean isZero  = (c % 40.00) == 0.00;
        System.out.println("Is c zero? " + isZero);

        if (isZero) {
            System.out.println("c is zero");
        } else {
            System.out.println("c is not zero");
        }
    }
}
