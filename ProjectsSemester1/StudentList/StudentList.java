
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
}
