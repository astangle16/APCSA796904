import java.util.*;
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.*;
public class StudentListRunner{

    public static void main(){
        StudentList studList = new StudentList();
        menuNumber(studList);

    }

    
    //  Allow user to choose activity
    public static void menuNumber(StudentList studList){
        Scanner kb = new Scanner(System.in);  // Create a Scanner object
        String inputStr = "";

        while(!inputStr.equals("8")){

            System.out.println("welcome tell me what you want to do");
            System.out.println("1 [add student to list] ");
            System.out.println("2 [delete Student From List]");
            System.out.println("3 [edit Student List]");
            System.out.println("4 [clearList]");
            System.out.println("5 [printAll]");
            System.out.println("6 [printStudent]");
            System.out.println("7 [sortStudents]");
            System.out.println("8 [Quit]");

            inputStr = kb.nextLine();

            if(inputStr.equals("1")){
                System.out.println("Student name:");
                String fullName = kb.nextLine();
                System.out.println("Student number:");
                int stuNum  = kb.nextInt();
                String clearBuffer = kb.nextLine();
                System.out.println("GPA:");
                clearBuffer = kb.nextLine();
                double gpa = kb.nextDouble();  

                studList.addStudentToList(fullName, stuNum, gpa);
            }
            
             if(inputStr.equals("2")){
             studentList.deleteStudentToList();
             }
            // if(inputStr.equals("3")){
            // studentList.editStudentList();
            // }
            // if(inputStr.equals("4")){
            // studentList.clearList();
            // }
            // if(inputStr.equals("5")){
            // studentList..printAll();
            // }
            // if(inputStr.equals("6")){
            // studentList.printAll();
            // }
            // if(inputStr.equals("7")){
            // studentList.printStudent();
            // }
            // if(inputStr.equals("8")){
            // studentList.sortStudents();
            // }

        }

    }

}
