import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String text = getInput(sc); 
            boolean isPalindrome = checkPalindrome(text); // Check if palindrome
            displayResult(isPalindrome); // Display result
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Check if the string is a palindrome
    public static boolean checkPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    // Display result
    public static void displayResult(boolean isPalindrome) {
        System.out.println("Is the string a palindrome? " + (isPalindrome ? "Yes" : "No"));
    }
}

/*
Example Input:
Enter a string: racecar

Example Output:
Is the string a palindrome? Yes
*/

