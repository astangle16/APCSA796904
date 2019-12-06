import java.util.Scanner;
/**
 * Write a description of class Video16ManyMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tuna16
{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
tuna16 tunaObject = new tuna16();
System.out.println("enter name here:");
String temp = input.nextLine();             // stores name here
tunaObject.setName(temp);
tunaObject.saying();
 
}

}