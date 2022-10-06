
/**
 * How many lanternflies you catch.
 *
 * @Michelle Zheng
 * @10/6/2022 A redo
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that!");
        } // end if statement
        else {
            System.out.println("Thanks for doing your part");
            if (num > 10) {
                System.out.println("That is great! Tell us where did you go to catch these lanternflies.");
                String response = input.next();
                System.out.println("Answer: " + response);
                
        } // end if statement
    } // end else statement
    }// end of main method
} // end of class
