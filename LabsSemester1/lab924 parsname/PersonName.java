public class PersonName
{

    private String fName="", mName="", lName="";

    public PersonName() {
    }

    public PersonName(String fullName){
        parseName(fullName);

    }

    public void parseName(String fullName)
    {
        //System.out.println("Welocome to ParseLand..." + fullName);

        // Format One:      "Last, First Middle"
        // Format Two:      "Last, First"
        // Format Three:    "First Middle Last
        // Format Four:      "First Last"

        //int commaLocation = fullName.indexOf(",");
        int commma  = fullName.indexOf(","); // Comma location
        int firstspace = fullName.indexof(" "); // Space Location
        int secondspace = fullName.lastIndexOfc("");
        if(comma != -1 ) {// case 1 or 2 
            String restOfName = fullName.substring(ci+2);
            fName = restOfName.substring(si+1);
            lName = restOfName.substring(ci+1);
            mName = restOfName.substring(si+2);
            int spaceLocation = restOfName.indexOf(" ");

            if(spaceLocation != -1) {
                System.out.println("FORMAT 1");

                fName = restOfName.substring(0, spaceLocation);
                mName = restOfName.substring(spaceLocation+1, restOfName.length());
                lName = fullName.substring(0,comma);
                System.out.println("fName..." + fName);
                System.out.println("mName..." + mName); 
                System.out.println("lName..." + lName);

            } else { // this will be for case 3 or 4 

                
            }
        
            
        }
        
        // String restOfName = fullName.substring(commaLocation+2, fullName.length());
        //System.out.println("restOfName=" + restOfName);
        //int spaceLocation = restOfName.indexOf(" ");
        //Fname = restOfName.substring(0, spaceLocation);

        // restOfName = restOfName.substring(spaceLocation+1, restOfName.length());
        // System.out.println("restOfName=" + restOfName);
        // Mname = restOfName.substring(0, restOfName.length());

    }

    public String toString(){
        return fName + " " + mName + " " + lName;   
    }

}

