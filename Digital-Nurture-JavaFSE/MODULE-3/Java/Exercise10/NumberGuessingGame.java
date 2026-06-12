import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int hidden = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number (1-100):");
        while (guess != hidden) {
            guess = sc.nextInt();
            attempts++;
            if (guess < hidden)
                System.out.println("Too low, try again:");
            else if (guess > hidden)
                System.out.println("Too high, try again:");
        }
        System.out.println("Correct! You took " + attempts + " attempt(s).");
        sc.close();
    }
}
