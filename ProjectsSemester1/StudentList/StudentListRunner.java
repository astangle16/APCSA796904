import java.util.*;
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.*;
public class StudentListRunner
{

    public static void main(){
        StudentListRunner studList = new StudentListRunner();
        name.menuNumber();
        int number = name.menuNumber;
        makeMenu();
    }

    public int menuNumber()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Print 1 to add a student");

        int student = myObj.nextInt();
        return student;
        while(inputStr.equals("8")){

            System.out.println("welcome tell me what you want to do");
            System.out.println("1 [add student to list] ");
            System.out.println("2 [delete Student From List]");
            System.out.println("3 [edit Student List]");
            System.out.println("4 [clearList]");
            System.out.println("5 [printAll]");
            System.out.println("6 [printStudent]");
            System.out.println("7 [sortStudents]");
            System.out.println("8 [Quit]");

            inputStr = kb.nextline();

            if(inputStr.equals("1")){
                studentList.clearLst();
            }
            if(inputStr.equals("2")){
                studentList.addStudentToList();
            }
            if(inputStr.equals("3")){
                studentList..deleteStudentFromList();
            }
            if(inputStr.equals("4")){
                studentList.editStudentList();
            }
            if(inputStr.equals("5")){
                studentList.clearList();
            }
            if(inputStr.equals("6")){
                studentList.printAll();
            }
            if(inputStr.equals("7")){
                studentList.printStudent();
            }
            if(inputStr.equals("8")){
                studentList.clearList();
            }

        }
    }
}
