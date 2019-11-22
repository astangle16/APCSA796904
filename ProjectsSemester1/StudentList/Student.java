/**
 * Write a description of class Student here.
 *
 * @author (Allecz RoadRiguese)
 * @version (1115)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int stuNum;
    private double gpa;
    private String fName = "";
    private String mName = "";
    private String lName = "";

    public Student(String fullName,int stuNum,double gpa){
        this.stuNum = stuNum;
        this.gpa = gpa;
        parseName(fullName);
    }

    public void parseName(String fullName)    {
        int fsi = fullName.indexOf(" "); // first space index
        int lsi = fullName.lastIndexOf(" "); // last space index
        int ci =  fullName.indexOf(","); // comma index

        // System.out.println("index_of_first_space= " + index_of_first_space);
        // System.out.println("index_of_second_space= " + index_of_second_space);
        // System.out.println("index_of_comma= " + index_of_comma);

        if(ci != -1){ // comma 
            if(fsi != lsi) { // two spaces
                System.out.println("comma two spaces");              
                // Format Three:    "First, Middle Last"
                fName = fullName.substring(0, fsi-1);
                mName = fullName.substring(fsi+1, lsi);
                lName = fullName.substring(lsi, fullName.length());

            } else { // one space

                System.out.println("comma one space");             
                fName = fullName.substring(lsi+1, fullName.length());

                lName = fullName.substring(0, ci);
            }

        } else {  // no comma

            if(fsi != lsi) { // two spaces
                fName = fullName.substring(0, fsi);
                mName = fullName.substring(fsi, lsi );
                lName = fullName.substring(lsi, fullName.length());
                System.out.println("no comma and two spaces");             

            } else { // one space
                fName = fullName.substring(0, fsi);
                mName = fullName.substring(fsi, lsi );
                lName = fullName.substring(lsi, fullName.length());
                System.out.println("no comma and one spaces");             
            }

        }

        System.out.println("fName=" + fName);
        System.out.println("mName=" + mName);
        System.out.println("lName=" + lName);

    }
    public int getStuNum(){
        return stuNum;
    }
    public String getLastName(){
        return lName;
    }
    public double getGPA(){
    return gpa;
    }
}
