import java.util.*;
/**
 * Write a description of class Bubble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public BubbleSort()
    {
        {
            int n = arr.size();
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr.get(j) > arr.get(j+1))
                    {
                        // swap temp and arr[i]
                        int temp = arr.get(j);
                        arr.set(j, arr.get(j+1));
                        arr.set(j+1, arr.get(temp));
                    }

        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void loadNumbers(int n){
        
    double d = Math.random()*100;
    int i =  (int)d+1;
    
    
    }
}
