package Array;
import java.util.HashSet;
import java.util.Set;

public class duplicate_arr {

    
       
    public static void main(String[] args) {
        

        // Time Complexity =
        //Space Complexity = 

        //1 - Have 1 array and 1 target sum
        //2 - checkout what numbers of array get the target sum
        //3 - return a array with those indices
 
         Integer[] arr = {1,2,3,4};
         
       System.out.println(duplicate2(arr)); 
    }

    public static boolean duplicate1(Integer[] arr)
    {
        if(arr.length > 0)
        {
            for (int i = 0; i < arr.length; i++) 
                {
                   for(int j = i+1; j<arr.length;j++)
                        if(arr[i]== arr[j])
                            return true;

                }
        }

        return false;
    }

    public static boolean duplicate2(Integer[] arr)
    {
        if(arr.length > 0)
        {
         Set<Integer> duplicate = new HashSet<>(); // not duplicated
            
            for (int i = 0; i <= arr.length-1; i++) 
                    duplicate.add(arr[i]);

            if(duplicate.size() == arr.length)
                    return false;
                else 
                    return true;    
        }

        return false;
    }
}
