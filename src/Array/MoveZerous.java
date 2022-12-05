package Array;
import java.util.Arrays;

public class MoveZerous {
    
    
    public static void main(String[] args) {
        

        // Time Complexity =
        //Space Complexity = 

        //1 - Have 1 array and 1 target sum
        //2 - checkout what numbers of array get the target sum
        //3 - return a array with those indices
 
         Integer[] arr = {0,1,0,3,12};
         
         if(arr.length > 0)
         {
            int lastNonZeroFoundAt = 0;
                // If the current element is not 0, then we need to
                // append it just in front of last non 0 element we found. 
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        arr[lastNonZeroFoundAt++] = arr[i];
                    }
                }

                // After we have finished processing new elements,
                // all the non-zero elements are already at beginning of array.
                // We just need to fill remaining array with 0's.
                for (int i = lastNonZeroFoundAt; i < arr.length; i++) {
                    arr[i] = 0;
                }
                    }

         System.out.println(Arrays.toString(arr)); 

    }
}
