import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(10) + 1; 
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("Welcome to the Game!");
            System.out.println("Guess the number between 1 and 10. You have 3 tries.");

            while (attempts < 3) {
                System.out.print(" guess the number : ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    hasWon = true;
                    break;
                } else {
                    System.out.println("Wrong guess! Try again.");
                }
            }

            if (hasWon) {
                System.out.println("Congratulations! You guessed the number correctly.");
            } else {
                System.out.println("Sorry, you've used all 3 attempts. The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}