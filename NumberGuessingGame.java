import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        try {
            int lowerBound = 1;
            int upperBound = 100;
            int guess;
            char feedback;

            System.out.println("Think of a number between 1 and 100.");
            System.out.println("Provide feedback for each guess: 'h' for high, 'l' for low, 'c' for correct.");

            do {
                guess = generateGuess(lowerBound, upperBound, rand); // Generate a random guess
                System.out.println("Computer's guess: " + guess);
                System.out.print("Enter your feedback (h/l/c): ");
                feedback = sc.next().charAt(0);

                if (feedback == 'h') {
                    upperBound = guess - 1; // Adjust upper bound
                } else if (feedback == 'l') {
                    lowerBound = guess + 1; // Adjust lower bound
                }
            } while (feedback != 'c');

            System.out.println("The computer guessed your number correctly!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Generate a random guess within a range
    public static int generateGuess(int lowerBound, int upperBound, Random rand) {
        return lowerBound + rand.nextInt(upperBound - lowerBound + 1);
    }
}

/*
Example Interaction:
Think of a number between 1 and 100.
Provide feedback for each guess: 'h' for high, 'l' for low, 'c' for correct.
Computer's guess: 50
Enter your feedback (h/l/c): h
Computer's guess: 25
Enter your feedback (h/l/c): l
Computer's guess: 37
Enter your feedback (h/l/c): c
The computer guessed your number correctly!
*/

