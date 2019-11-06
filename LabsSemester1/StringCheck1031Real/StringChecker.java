
/**
 * Write a description of class StringChecker here.
 *
 * @author (Alleccz Ztanjul!7)
 * @version (a version number or a date)
 */
import java.util.*;
public class StringChecker{
    
    private String[] wordArray = {"cat", "catcher", "Thatcher", "catdog", "caterpillar"};
    private ArrayList<String> wordList = new ArrayList<String>();
    private String key = "cat";

    public StringChecker(){
        loadWordList();
        ArrayList<String> keyList = wordChecker(wordArray, key);
        //  Write the function printList
    //    printList(keyList);
    }
    
    public void loadWordList(){
        wordList.add("cat");
        wordList.add("catcher");
        wordList.add("Thatcher");
        wordList.add("catdog");
        wordList.add("caterpillar");
            
    }

    public ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                if(str[i].indexOf(key) != -1){
                    tempList.add(str[i]);
                }
            }
        }

        return tempList;
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

