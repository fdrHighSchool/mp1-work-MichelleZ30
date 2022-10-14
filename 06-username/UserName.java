import java.util.Scanner;
import java.util.Random;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("What is your favorite number? ");
    String favNum = s.nextLine();
    
    // test output
    System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName)  + ". " + favNum);
    
    System.out.println("Are you a student or a teacher?\nStudent\nTeacher");
    String mode = s.nextLine();
    mode = mode.toLowerCase();
    if (mode.equals("student")) {
        System.out.println("Student Email: " + firstName + initialize(lastName) + favNum + "@nycstudents.net");
    }//end of yes response if method
    else {
        System.out.println("Teacher Email: " + initialize(firstName) + lastName + favNum + "@schools.nyc.gov");
    }//end of no response else method
    
    System.out.println("Do you want the computer to get a random password?\nYes\nNo");
    String res = s.nextLine();
    res = res.toLowerCase();
    if (res.equals("yes")) {
        int pass = r.nextInt(10+1);
        System.out.println("Pass: " + pass);
    }
    else {
    System.out.println("Thank you for replying to this prompt! :D");
    }
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
