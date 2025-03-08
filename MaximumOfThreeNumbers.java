import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = sc.nextInt();

            // Find the maximum of three numbers		
            int max = findMaximum(num1, num2, num3); 
            System.out.println("The maximum of the three numbers is: " + max);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}

/*
Example Input:
Enter the first number: 10
Enter the second number: 25
Enter the third number: 15

Example Output:
The maximum of the three numbers is: 25
*/

