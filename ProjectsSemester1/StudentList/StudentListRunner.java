
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.*;
public class StudentListRunner
{
    
    // instance variables - replace the example below with your own

    public static void main(){
    StudentListRunner name = new StudentListRunner();
    name.menuNumber();
    int number = name.menuNumber;
    }
    /**
     * Constructor for objects of class StudentListRunner
     */
    public int menuNumber()
    {
       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Print 1 to add a student");
      
       int student = myObj.nextInt();
       return student;
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
