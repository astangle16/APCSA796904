import java.util.Scanner;
/**
 * Write a description of class Video16ManyMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Video16ManyMethods
{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
tuna tunaObject = new tuna();
System.out.println("enter name here:");
String temp = input.nextLine();             // stores name here
tunaObject.setName(temp);
tunaObject.saying();
 
}

}