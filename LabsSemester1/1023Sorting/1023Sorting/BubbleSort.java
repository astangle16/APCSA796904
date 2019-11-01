import java.util.*;
/**
 * Alec Rodriguez Stangle
 * 11/1/19
 * 1023 Sorting
 */
public class BubbleSort{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public BubbleSort()
    {
        
            int n = arr.size();
            loadNumbers(10);
            
            //bubble sort
            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-i-1; j++){
                    if (arr.get(j) > arr.get(j+1)){
                        // swap temp and arr[i]
                        int temp = arr.get(j);
                        arr.set(j, arr.get(j+1));
                        arr.set(j+1, arr.get(temp));
                    }
                }
                

        }
        
        printArray();
    }

    public void printArray()
    {
        int n = arr.size();
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void loadNumbers(int n){
    for(int i = 0; i < n; i++)
    {
    int d =(int) Math.random()*100;
    arr.add(d);
        
    }
       // int i =  (int)d+1;
    
    
    }
}
