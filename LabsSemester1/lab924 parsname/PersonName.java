public class PersonName
{

    public String Fname="", Mname="", Lname="";
    

    public PersonName() {
    
    }
    
    public PersonName(String fullName){
        parseName(fullName);
    
    }
    
    
    public void parseName(String fullName)
    {
        System.out.println("Welocome to ParseLand..." + fullName);
        
        // Format One:  	"Last, First Middle"
        if(fullName.contains(",") && !fullName.matches("\\S+")) {
            System.out.println("FORMAT 1");

            int commaLocation = fullName.indexOf(",");
            Lname = fullName.substring(0,commaLocation);
            
            String restOfName = fullName.substring(commaLocation+2, fullName.length());
            System.out.println("restOfName=" + restOfName);
            int spaceLocation = restOfName.indexOf(" ");
            Fname = restOfName.substring(0, spaceLocation);
           
            restOfName = restOfName.substring(spaceLocation+1, restOfName.length());
            System.out.println("restOfName=" + restOfName);
            Mname = restOfName.substring(0, restOfName.length());

        }
        
        //Format Two:  	"Last, First"
         
        // Format Three:  	"First Middle Last"
            
        //  Format four:  	"First Last"
        
        // log
       System.out.println("Fname..." + Fname);
       System.out.println("Mname..." + Mname); 
       System.out.println("Lname..." + Lname);
    }
}
