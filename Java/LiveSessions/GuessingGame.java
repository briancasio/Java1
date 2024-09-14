import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomTargetNumber = /*your code goes here */
        int guess = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 10:");

        while (/*your code goes here */) {
            guess = scanner.nextInt();



            if (/*your code goes here */) {
                System.out.println("Too low! Try again:");
            } 
            else if (/*your code goes here */) {
                System.out.println("Too high! Try again:");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number.");
            }



        }
        scanner.close();
    }
}
