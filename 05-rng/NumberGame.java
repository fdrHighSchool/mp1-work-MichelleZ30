
/**
 * Creating random number game with  different modes.
 *
 * @Michelle Zheng
 * @10/6/2022
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        
        int maximum;
        if(mode.equals("Easy")) {
          maximum = 1;
        } // end if statement
        else if (mode.equals("Medium")) {
          maximum = 5;
        } // end else if statement
        else {
          maximum = 10;
        } // end else statement

        int mysteryNumber = r.nextInt((maximum)*10)+1; // place-holder for now
        System.out.println(mysteryNumber);

        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt();

        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
                System.out.println("Want to try again?\nYes\nNo");
                String ans = s.nextLine();
                if (ans.equals("Yes")) {
                    
                }
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
        
        s.close();
    } // end main method
} // end class