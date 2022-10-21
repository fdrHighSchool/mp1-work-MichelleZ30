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
    
    System.out.println("Do you want the computer to genarate a random password?\nYes\nNo");
    String res = s.nextLine();
    res = res.toLowerCase();
    if (res.equals("yes")) {
        System.out.println(generatePassword(8));
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
  
   public static String generatePassword(int length) {
    String password = "";
    
    for (int i = 0; i<length; i++) {
    int rand1 = (int)(Math.random() * (90-65+1) + 65); 
    char c1 = (char)rand1;
    
    int rand2 = (int)(Math.random() * (57-48+1)+48);
    char c2 = (char)rand2;
    
    int rand3 = (int)(Math.random() * (122-97+1)+97);
    char c3 = (char)rand3;
    
    password = password + c1 + c2 + c3;
    }
    return password;
    }
    // need a loop of len "length"
    
    // pull a random number from range (65-90 CAPS) (48-57 #s) (97-122 lower)

    // convert int to char (c =(char)i;)

    // append char to the String password (password = password + c)
    
    //int rand = (int)(Math.random() * (90-65+1)+65);
    //int rand = (int)(Math.random() * (57-48+1)+48);
    //int rand = (int)(Math.random() * (122-97+1)+97);
  }// end class
