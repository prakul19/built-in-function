import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Choose operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            double result = performOperation(num1, num2, operation); // Perform chosen operation
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Perform chosen operation
    public static double performOperation(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2); // Addition
            case '-':
                return subtract(num1, num2); // Subtraction
            case '*':
                return multiply(num1, num2); // Multiplication
            case '/':
                return divide(num1, num2); // Division
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

/*
Example Input:
Enter first number: 10
Enter second number: 5
Choose operation (+, -, *, /): /

Example Output:
Result: 2.0
*/

