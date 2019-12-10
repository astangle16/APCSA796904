import java.util.Scanner;

/**
 * Write a description of class apple21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class apple21
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        
        while(counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
            
    }
    
    average = total/10;
    System.out.println("your average is" + average);
    
    
        
    }
}
