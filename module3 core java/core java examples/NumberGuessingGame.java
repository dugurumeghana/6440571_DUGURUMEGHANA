import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number (1 to 100):");

        while (true) {
            guess = sc.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Correct! The number was " + numberToGuess);
                break;
            }
        }
    }
}
