import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter temperature: ");
            double temperature = sc.nextDouble();
            System.out.print("Convert to (C/F): ");
            char scale = sc.next().charAt(0);

            if (scale == 'C') {
                double celsius = convertToFahrenheitToCelsius(temperature); // Convert to Celsius
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (scale == 'F') {
                double fahrenheit = convertToCelsiusToFahrenheit(temperature); // Convert to Fahrenheit
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else {
                System.out.println("Invalid scale");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Convert Fahrenheit to Celsius
    public static double convertToFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertToCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

/*
Example Input:
Enter temperature: 100
Convert to (C/F): C

Example Output:
Temperature in Celsius: 37.77777777777778
*/

