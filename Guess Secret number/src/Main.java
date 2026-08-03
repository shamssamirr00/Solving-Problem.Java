import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secret_number = rand.nextInt(100) + 1;
        int guess_number = 0;
        int attempts = 0;
        do {
            System.out.print("Enter your guess: ");
            guess_number = input.nextInt();
            attempts++;
            if (guess_number > secret_number) {
                System.out.println("Too High");
            } else if (guess_number < secret_number) {
                System.out.println("Too Low");
            }
        }while (guess_number != secret_number);
    System.out.println("Correct guess  ");
        System.out.println("Number of attempts: " + attempts);
    }
}