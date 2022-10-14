import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

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
    System.out.println("What is your email before the @?");
    String respond = s.nextLine();
    
    if (mode.equals("Student")) {
        System.out.println("Student Email: " + respond + "@nycstudents.net");
        
    }
    else {
        System.out.println("Teacher Email: " + respond + "@schools.nyc.gov");
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
