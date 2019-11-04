
/**
 * Write a description of class StringChecker here.
 *
 * @author (Alleccz Ztanjul!7)
 * @version (a version number or a date)
 */
public class StringChecker{

    public StringChecker(){
        
    }

    public ArrayList<String> wordChecker(string[] str, string key){
        ArrayList<String> templist = new ArrayList<Strings>();
        for(int i = 0; 1 < str.length; i++){
            if(str[i] != null){
                if(str[i].indexOf(key) != -1){
                    templist.add(str[i]);
                }
            }
        }

        return templist;
    }

    // {
    // // instance variables - replace the example below with your own
    // private int x;

    // /**
    // * Constructor for objects of class StringChecker
    // */
    // public StringChecker()
    // public String[] wordChecker(ArrayList<String> str, String key{
    // String[] tempList = new String [str.size; i++)];
    // for(int i = 0; i < str.size(); 1++);{
    // if(str.get(i) !=null){
    // if(str.get(i).indexOf(key() ! = -1){
    // tempList[i] = str.get(i);
    // }
    // }
    // }
    // return templist;
    // }
    //}      

    public static void main(){
        StringChecker sc = new StringChecker();
    }

}

