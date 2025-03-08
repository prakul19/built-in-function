import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = getInput(sc, "Enter the first number: "); // Get first number
            int num2 = getInput(sc, "Enter the second number: "); // Get second number
            int gcd = calculateGcd(num1, num2); // Calculate GCD
            int lcm = calculateLcm(num1, num2, gcd); // Calculate LCM
            displayResult(gcd, lcm); // Display results
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Calculate GCD using Euclidean algorithm
    public static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGcd(b, a % b);
    }

    // Calculate LCM using GCD
    public static int calculateLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Display results
    public static void displayResult(int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}

/*
Example Input:
Enter the first number: 12
Enter the second number: 15

Example Output:
GCD: 3
LCM: 60
*/

