public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(123456789));
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

        return getDurationString(minutes / 60, minutes % 60, seconds);
    }

    public static String getDurationString(int hours, int minutes, int seconds) {

        if (hours < 0) {
            return "Invalid value for hours";
        }

        if (minutes < 0 || minutes > 59) {
            return "Invalid value for seconds";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid value for seconds";
        }

        return hours / 24 + " Days - "
                + String.format("%02d", hours % 24) + "h "
                + String.format("%02d", minutes) + "m "
                + String.format("%02d", seconds) + "s";
    }
}