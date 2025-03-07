import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Add 7 days, 1 month, and 2 years
            date = date.plusDays(7).plusMonths(1).plusYears(2);

            // Subtract 3 weeks
            date = date.minusWeeks(3);

            System.out.println("Final date after arithmetic: " + date.format(formatter));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

/*
Example Input:
Enter a date (yyyy-MM-dd): 2023-04-01

Example Output:
Final date after arithmetic: 2025-04-08
*/

