public class Main {

    public static void main(String[] args) {
        // "myVariable = 50" is an expression.
        // The whole line "int myVariable = 50;" is a statement
        int myVariable = 50;

        // These are all statements
        myVariable++;
        myVariable--;

        System.out.println("My variable = " + myVariable);

        System.out.println("This is a statement!");
        System.out.println(
            "This is " +
            "also " +
            "a statement " +
            "but in multiple lines for clarity!"
        );
        System.out.println("This is " + "also " + "a statement " + "but in multiple lines for clarity!");

        // What is a whitespace? Whitespace is a space, tab, or newline character.
        // Makes the code more readable.
    }
}