import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(101); // Generates a random number between 0 and 100
        int guess = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 0 and 100. Can you guess it?");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations, you guessed the number!");
            }
        }

        scanner.close();
    }
}
