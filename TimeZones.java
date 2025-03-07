import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {

    public static void main(String[] args) {
        try {
            displayCurrentTimeInTimeZones();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to display current time in different time zones
    public static void displayCurrentTimeInTimeZones() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in GMT: " + gmt.format(formatter));
        System.out.println("Current time in IST: " + ist.format(formatter));
        System.out.println("Current time in PST: " + pst.format(formatter));
    }
}

/*
Example Output:
Current time in GMT: 2023-04-06 04:23:12 GMT
Current time in IST: 2023-04-06 09:53:12 IST
Current time in PST: 2023-04-05 21:23:12 PDT
*/

