public class PersonName
{

    public String fName="", mName="", lName="";

    public PersonName() {
    }

    public PersonName(String fullName){
        parseName(fullName);

    }

    public void parseName(String fullName)
    {
        //System.out.println("Welocome to ParseLand..." + fullName);

        // Format One:      "Last, First Middle"
        // if(fullName.contains(",") && !fullName.matches("\\S+")) {

        int commaLocation = fullName.indexOf(",");
        if(commaLocation != -1 ) {
            String restOfName = fullName.substring(commaLocation+2, fullName.length());
            System.out.println("restOfName=" + restOfName);
            int spaceLocation = restOfName.indexOf(" ");
            if(spaceLocation != -1) {
                System.out.println("FORMAT 1");

                fName = restOfName.substring(0, spaceLocation);
                mName = restOfName.substring(spaceLocation+1, restOfName.length());
                lName = fullName.substring(0,commaLocation);
                System.out.println("fName..." + fName);
                System.out.println("mName..." + mName); 
                System.out.println("lName..." + lName);

            }   
        
            int ci  = str.indexOf(",")
            int si = str.indexof(" ")
            int lsi = str.lastIndexOfc("")
            
       
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
       return fName + mName + lName;   
    }

}

