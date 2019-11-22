/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class StudentList{
    ArrayList<Student> studList = new ArrayList<Student>();

    public void addStudentToList(String fullName, int sn, double gpa){
      Student s = new Student(fullName, sn, gpa);
      studList.add(s);
    }

    //public void parseName(string fullName){}

    public void deleteStudent(String lastName)
    {

    }

    public void deleteStudent(int stuNumber)
    {

    }

    public void editStudentList(String lastName)
    {
        

    }
    public void printStudentList()
    {
          for(int i = 0; i < studList.size(); i++){
            Student stud = studList.get(i);
            
            int stuNumHolder = stud.getStuNum();
            String lName = stud.getLastName();
            double gpa = stud.getGPA();
            System.out.println("name" +name +"StudName" + student name +"Student num" +student num +"gpa" +gpa););
            
            }
        }
    }
}
