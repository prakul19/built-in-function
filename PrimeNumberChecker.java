import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            boolean isPrime = checkPrime(num); // Check if the number is prime
            System.out.println("Is the number prime? " + (isPrime ? "Yes" : "No"));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
		// Found a divisor, not prime
                return false; 
            }
        }
	// No divisors, prime
        return true; 
    }
}

/*
Example Input:
Enter a number: 29

Example Output:
Is the number prime? Yes
*/

