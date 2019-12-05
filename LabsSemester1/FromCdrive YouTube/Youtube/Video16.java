
/**
 * Write a description of class Video16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Video16{
    private String girlName;
    public void setName(String name){
        girlName = name;
    }

    public String getName(){
        return girlName;   
    }

    public void saying(){
        System.out.printf("your first gf was%s", getName());

    }
}
