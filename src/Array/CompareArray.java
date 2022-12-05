package Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareArray {

    
    public static void main(String[] args) {
               
        Character[] myArray_Obj = {'a', 'b', 'c','d','e'};
        Character[] myArray =  {'x', 'd', 'k','u','p'};

        Set<Character> array_set = new HashSet<>(Arrays.asList(myArray_Obj));

        System.out.println(check(myArray,array_set));

        
    }

    public static boolean check (Character[] myArray, Set<Character> Hash)
    {
        for(int i=0; i<myArray.length;i++)
        {
            if(Hash.contains(myArray[i]))
                return true;
        }
        return false;
    }

        // Time Complexity O(n)
    // Space Complexity O(n)
    
}
