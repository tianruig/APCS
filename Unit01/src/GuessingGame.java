/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: Guessing Game
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Random generator = new Random();

        // Keep playing game until user loses or decides to stop.
        int cont = 1;
        while (cont == 1) {
            int number = generator.nextInt(100) + 1;

            if (guessNumber(number, 5)) {
                System.out.print("Do you want to play again? (1 = yes, 2 = no) ");
                cont = input.nextInt();

                while (cont != 1 && cont != 2) { //If user enters some other number.
                    System.out.print("That's not a valid option. (1 = yes, 2 = no) ");
                    cont = input.nextInt();
                }
            } else {
                cont = 2;
            }
        }

        input.close();
    }

    /**
     * guessNumber allows the user to guess a number within a certain number of
     * tries and tells the user whether their guess is higher or lower that the
     * number. It returns true if the user has successfully guessed the number
     * within the allotted number of tries and false otherwise.
     */
    private static boolean guessNumber(int number, int tries) {
        System.out.print("Guess a number 1-100: ");
        int guess = input.nextInt();

        for (int i = 0; i < tries; i++) {
            if (guess == number) { //User gets correct number.
                System.out.println("Correct! The number was " + number
                        + ". You guessed this in " + (i + 1) + " tries.");
                return true;
            } else if (guess > number && i < tries - 1) { //Not shown on last try.
                System.out.print("Your number is too high, guess again: ");
                guess = input.nextInt();
            } else if (guess < number && i < tries - 1) {
                System.out.print("Your number is too low, guess again: ");
                guess = input.nextInt();
            }
        }

        System.out.println("Sorry.. you did not guess the number in " + tries
                + " tries. " + "The correct number was " + number + ".");
        return false;
    }
}
