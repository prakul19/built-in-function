import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of terms: ");
            int numTerms = sc.nextInt();
            generateFibonacci(numTerms); // Generate Fibonacci sequence
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Generate and print the Fibonacci sequence
    public static void generateFibonacci(int numTerms) {
        int a = 0, b = 1;
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(a + " ");
            int next = a + b; // Calculate the next term
            a = b;
            b = next;
        }
        System.out.println();
    }
}

/*
Example Input:
Enter the number of terms: 10

Example Output:
0 1 1 2 3 5 8 13 21 34
*/

