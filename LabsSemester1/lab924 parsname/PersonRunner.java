import java.util.Scanner;
public class PersonRunner{
    
   
    public static void main(){
    
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        
        while(!inputStr.equals("quit")){
            
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            PersonName per = new PersonName(inputStr);
            
        }
        //System.out.print
        
    }
}
