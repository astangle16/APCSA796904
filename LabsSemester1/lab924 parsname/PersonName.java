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

    public String fName="", mName="", lName="";

    public PersonName(String fullName){
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
  }
}

  
  


