import java.util.Random;
import java.util.*;

public class codsoft_𝒕𝒂𝒔𝒌𝒏𝒐.1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int LOW = 1;
        final int HIGH = 100;
        final int MAX_ATTEMPTS = 10;

        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(HIGH - LOW + 1) + LOW;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between " + LOW + " and " + HIGH + ":");

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the number correctly!");
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
