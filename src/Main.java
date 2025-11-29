public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 nor 2");
        }

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Switch Value was 1");
//                break;
//            case 2:
//                System.out.println("Switch Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Switch Value was between 3 and 5");
//                break;
//            default:
//                System.out.println("Switch Value was not 1, 2, 3, 4 or 5");
//                break;
//        }

        int enhancedSwitchValue = 3;

        switch (enhancedSwitchValue) {
            case 1 -> System.out.println("Switch Value was 1");
            case 2 -> System.out.println("Switch Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Switch Value was between 3 and 5");
                System.out.println("Value was " + enhancedSwitchValue);
            }
            default -> System.out.println("Switch Value was not 1, 2, 3, 4 or 5");
        }

        String month = "March";
        System.out.println(month + " is in the " + getQuarter(month));
        month = "August";
        System.out.println(month + " is in the " + getQuarter(month));
        month = "Augusta";
        System.out.println(month + " is in the " + getQuarter(month));
    }

    public static String getQuarter(String month) {
//        switch (month) {
//            case "January":
//            case "February":
//            case "March":
//                return "1st quarter";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd quarter";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd quarter";
//            case "October":
//            case "November":
//            case "December":
//                return "4th quarter";
//        }
//
//        return "Bad value for month";

        return switch (month) {
            case "January", "February", "March" -> "1st quarter";
            case "April", "May", "June" -> "2nd quarter";
            case "July", "August", "September" -> "3rd quarter";
            case "October", "November", "December" -> "4th quarter";
//            default -> "Bad value for month " + month;
            default -> {
                String response = "Bad value for month " + month;
                yield response;
            }
        };

    }
}