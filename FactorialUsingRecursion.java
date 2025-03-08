import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int number = getInput(sc); 
            int result = calculateFactorial(number); // Calculate factorial
            displayResult(result); // Display result
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Calculate factorial using recursion
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Display result
    public static void displayResult(int result) {
        System.out.println("Factorial: " + result);
    }
}

/*
Example Input:
Enter a number: 5

Example Output:
Factorial: 120
*/

