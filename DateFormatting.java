import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {
        try {
            displayCurrentDateInFormats();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to display current date in three different formats
    public static void displayCurrentDateInFormats() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current date in dd/MM/yyyy format: " + currentDate.format(formatter1));
        System.out.println("Current date in yyyy-MM-dd format: " + currentDate.format(formatter2));
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + currentDate.format(formatter3));
    }
}

/*
Example Output:
Current date in dd/MM/yyyy format: 07/03/2025
Current date in yyyy-MM-dd format: 2025-03-07
Current date in EEE, MMM dd, yyyy format: Fri, Mar 07, 2025
*/

