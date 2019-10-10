import java.io.*;
import java.util.*;

/*
 * SOLUTION parsname 924 926
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
            if(count <= persons.length){
                //add person
                persons[count] = new persons(inputStr);
                persons = extendArray(persons,2);
                // increase count
                count++;
            }
        }
    }

    public static Persons[] extendArray(Persons[] p1,int n){
        Persons[] p2 = new Persons[p1.length + n];

        for(int i = 0; i <p1.length; i++){
            p2[i] = p1[i];
        }
        return p2;
    }
}
}



//  public Person[] extendArray(Person[] p1, int i){

//    Person[] s2 = new Person[p1.length+i];
//    for(int i = 0; i <p1.length; i++){
//        p2[i] = p1[i];
//    }
//    
//    public static void main(){
//        Person[] persons = new Persons[2];
//        int count = 0;

//        Scanner kb = new Scanner(System.in);
//        System.out.println("enter a name");
//        String kbInput = kb.nextLine();

//   while(kbInput.equals(

        
