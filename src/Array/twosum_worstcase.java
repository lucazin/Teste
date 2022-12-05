package Array;
import java.util.Arrays;

public class twosum_worstcase {


    public static void main(String[] args) {
        

        // Time Complexity =
        //Space Complexity = 

        //1 - Have 1 array and 1 target sum
        //2 - checkout what numbers of array get the target sum
        //3 - return a array with those indices
 
         Integer[] arr1 = {2,7,11,15};
         int target = 9;
         Integer[] result = new Integer[2];

         //*** */ Worst Case
         // first we check if array is null
         
         if(arr1.length > 0)
         {
            for(int i=0;i<=arr1.length-1;i++)
            {
                for(int j=0;j<=arr1.length-1;j++)
                {
                    if(arr1[i] + arr1[j] == target)
                    {
                        result[0] = arr1[i];
                        result[1] = arr1[j]; 
                    }
                    
                }
            }
         }
         
         System.out.println(Arrays.toString(result)); 
        }
}
