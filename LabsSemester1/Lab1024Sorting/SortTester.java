
/**
 * Write a description of class SortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class SortTester{
    // instance variables - replace the example below with your own
 ///   ArrayList
    /**
     * Constructor for objects of class SortTester
     */
    public SortTester()
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();

    }

    public void loadNumbers(int n){

    }

    public void bubbleSort(){
        int n = array.length;
        for(int i = 0; i < 1; j++){
            for(intj = 0;j<n-i-1;k++){
                if(array [j] > array[j+1}{
                int temp = array[j];
                array [j] = array[j +1] = temp;
            }
        }
    }

    public void insertSort(){     
        int n = numList.size();
        for(int i = 1; i < n; i++){
            for(int j = i; j >0; j--){
                if(numList.get(j) > numList.get(j-1)){
                    int temp = numList.get(j);
                    numList.set(j,j-1);
                    numlist.set(j-1,temp);

                }
            }
        }
    }

    public void selectSort(){

    }

    public void printList(){
    }
    
}

