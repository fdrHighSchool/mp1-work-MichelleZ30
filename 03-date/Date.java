
/**
 * The input of date.
 *
 * @Michelle Zheng
 * 10/6/2022 Delted work a redo assignment
 */
import java.util.Scanner; //import scanner class
public class Date {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);//created scanner object
    
    System.out.println("What day of the week it is?");
    String day = s.nextLine();
    
    System.out.println("Which month of the year?");
    String month = s.nextLine();
    
    System.out.println("Which date of this month?");
    int date = s.nextInt();
    
    System.out.println("Which year is it?");
    int year = s.nextInt();
    
    System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
    System.out.println("European Format: " + day + " " + date+ " " + month + " " + year);
    }
}