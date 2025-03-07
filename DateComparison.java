import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String inputDate1 = sc.nextLine();
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String inputDate2 = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(inputDate1, formatter);
            LocalDate date2 = LocalDate.parse(inputDate2, formatter);

            compareDates(date1, date2);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to compare two dates and display the result
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}

/*
Example Input:
Enter the first date (yyyy-MM-dd): 2023-04-01
Enter the second date (yyyy-MM-dd): 2023-04-07

Example Output:
The first date is before the second date.
*/

