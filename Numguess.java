import java.util.Scanner;

public class Numguess {

    public static void guessingNumber() {
        Scanner sc = new Scanner(System.in);
        // Generate number
        int number = 1 + (int) (100 * Math.random());

        // Given K trials
        int k = 5;
        int i;
        System.out.println("Number chosen between 1 to 100. Guess the number within 5 trials.");

        // Iterate over k trials
        for (i = 1; i <= k; i++) {
            System.out.println("Guess the number:");
            // Input for guessing
            int guess = sc.nextInt();

            // If number is guessed
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (number > guess && i != k) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != k) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i > k) {
            System.out.println("You have exhausted your trials.");
            System.out.println("The number was " + number);
        }
    }

    // Driver code
    public static void main(String[] args) {
        // Function call
        guessingNumber();
    }
}
