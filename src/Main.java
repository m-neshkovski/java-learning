public class Main {

    public static void main(String[] args) {
        System.out.println(natoAlphabet('M'));
        System.out.println(natoAlphabet('I'));
        System.out.println(natoAlphabet('L'));
        System.out.println(natoAlphabet('O'));
        System.out.println(natoAlphabet('S'));
        System.out.println(natoAlphabet('H'));
    }
    
    public static String natoAlphabet(char n){
        switch (n) {
            case 'A':
                return "ABLE";
            case 'B':
                return "BAKER";
            case 'C':
                return "CHARLIE";
            case 'D':
                return "DOG";
            case 'E':
                return "EASY";
            case 'F':
                return "FOX";
            case 'G':
                return "GEORGE";
            case 'H':
                return "HOW";
            case 'I':
                return "ITEM";
            case 'J':
                return "JIG";
            case 'K':
                return "KING";
            case 'L':
                return "LOVE";
            case 'M':
                return "MIKE";
            case 'N':
                return "NAN";
            case 'O':
                return "OBOE";
            case 'P':
                return "PETER";
            case 'Q':
                return "QUEEN";
            case 'R':
                return "ROGER";
            case 'S':
                return "SUGAR";
            case 'T':
                return "TARE";
            case 'U':
                return "UNCLE";
            case 'V':
                return "VICTOR";
            case 'W':
                return "WILLIAM";
            case 'X':
                return "XRAY";
            case 'Y':
                return "YOKE";
            case 'Z':
                return "ZEBRA";
        }
        return "Bad character entered " + n;
    }
}