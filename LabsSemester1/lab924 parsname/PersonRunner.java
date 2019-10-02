import java.io.*;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

/*
 * SOLUTION
 */
class Solution {
  
  // main
  public static void main(String[] args) {  
      PersonRunner per = new PersonRunner();
  }
  
  /*
   * RUNNER
   */
  public static class PersonRunner {
  
    public PersonRunner() {
      
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        
        while(!inputStr.equals("quit")){
            
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            // System.out.println(inputStr);
            PersonName per = new PersonName(inputStr);
            
        }

    }
 }
  
  /*
   * PERSON NAME
   */
  public static class PersonName{

    public String Fname="", Mname="", Lname="";

    public PersonName(String fullName){
        parseName(fullName);
    }
    
    
    public void parseName(String fullName)    {

      int index_of_first_space = StringUtils.ordinalIndexOf(fullName, " ", 1);
      int index_of_second_space = StringUtils.ordinalIndexOf(fullName, " ", 2);
      int index_of_comma = StringUtils.ordinalIndexOf(fullName, " ", 1);
      
      // System.out.println("index_of_first_space= " + index_of_first_space);
      // System.out.println("index_of_second_space= " + index_of_second_space);
      // System.out.println("index_of_comma= " + index_of_comma);

      
      // Format One:    "Last, First Middle"   
      if(fullName.contains(",") && index_of_second_space!=-1) {  
        System.out.println("FORMAT 1");
      }

      //Format Two:    "Last, First"
      if(fullName.contains(",") && index_of_second_space==-1) {
        System.out.println("FORMAT 2");        
      }

      // Format Three:    "First Middle Last"
      if(!fullName.contains(",") && index_of_second_space!=-1) {
              System.out.println("FORMAT 3");        
      }     
      
      //  Format four:    "First Last"
      if(!fullName.contains(",") && index_of_second_space==-1) {
          System.out.println("FORMAT 4");
      }
      
    
  }
  
}

