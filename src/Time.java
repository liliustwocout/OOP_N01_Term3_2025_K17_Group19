public class Time {
    // Method to convert minutes to hours
    public static double convertMinutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Method to calculate time difference in seconds
    public static long timeDifferenceInSeconds(long startTime, long endTime) {
        return (endTime - startTime) / 1000;
    }

    // Method to get the current system time in milliseconds
    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }
}