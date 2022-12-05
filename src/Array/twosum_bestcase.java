package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum_bestcase {

    
    public static void main(String[] args) {
        

        // Time Complexity =
        //Space Complexity = 

        //1 - Have 1 array and 1 target sum
        //2 - checkout what numbers of array get the target sum
        //3 - return a array with those indices
 
         Integer[] arr1 = {9,1,5,2,3,7}; //problem with middle number
         
         //Integer[] arr1 = {2,3,7};

         int target = 9;
         Integer[] result = new Integer[2];


         result = mapx(arr1,target);
         System.out.println(Arrays.toString(result)); 

         //Check if array is greater than 0

        //  int count = 0;
        //  int index = 0;
        //  if(arr1.length > 0)
        //  {
        //     while(count <= arr1.length-1 && index < arr1.length-1)
        //     {
        //         if(arr1[count] + arr1[++index] == target)
        //         {
        //             result[0] = count;
        //             result[1] = index;
        //             break;
        //         }
        //         count++;
        //         //index++;
        //     }
        
        //     System.out.println(Arrays.toString(result)); 
        //  }
    }

    public static Integer[] mapx( Integer[] nums,int target)
    {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new Integer[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;

        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr1.length; i++) {
        //     int complement = target - arr1[i];
        //     if (map.containsKey(complement)) {
        //         return new Integer[] { map.get(complement), i };
        //     }
        //     map.put(arr1[i], i);
        // }
        // return null;
    }

}
