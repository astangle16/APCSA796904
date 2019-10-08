import java.io.*;
import java.util.*;



/*
 * SOLUTION
 */

  
  
  
  /*
   * RUNNER
   */
  public  class PersonRunner {
      
      // main
  public static void main(String[] args) {  
      PersonRunner per = new PersonRunner();
  }
  
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

 