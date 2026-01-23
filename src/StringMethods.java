public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "22.08.1983";
        int startIndex = birthDate.indexOf("1983");

        System.out.println("startIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("-", "22", "08", "1983");
        System.out.println("newDate = " + newDate);

        // This is inefficient
        newDate = "25";
        newDate = newDate.concat("-");
        newDate = newDate.concat("08");
        newDate = newDate.concat("-");
        newDate = newDate.concat("1983");
        System.out.println("newDate = " + newDate);

        // More efficient
        newDate = "25" + "-" + "08" + "-" + "1983";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("-").concat("08").concat("-").concat("1983");
        System.out.println("newDate = " + newDate);

        System.out.println("newDate = " + newDate.replace('-', '/'));
        System.out.println("newDate = " + newDate.replace("2", "00"));

        System.out.println("newDate = " + newDate.replaceFirst("-", "---"));
        System.out.println("newDate = " + newDate.replaceAll("-", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
