public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(59));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value for seconds";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid value for minutes";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid value for seconds";
        }

        return String.format("%02d", minutes / 60) + "h "
                + String.format("%02d", minutes % 60) + "m "
                + String.format("%02d", seconds) + "s";
    }
}