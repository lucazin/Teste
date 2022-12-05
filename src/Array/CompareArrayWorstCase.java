package Array;
public class CompareArrayWorstCase {

    public static void main(String[] args) {
        // lets run our functions

        Character[] myArray_Obj = {'a', 'b', 'c','d','e'};
        Character[] myArray =  {'x', 'd', 'k','u','p'};

        System.out.println(check(myArray_Obj,myArray));
    }

    public static boolean check (Character[] myArray_Obj1, Character[] myArray_Obj2)
    {
        for(int i=0; i<myArray_Obj1.length;i++)
        {
            for(int j=0; j<myArray_Obj2.length;j++)
            {
                if(myArray_Obj1[i] == myArray_Obj2[j])
                     return true;
            }
        }
        return false;
    }
    
    // Time Complexity O(n^2)
    // Space Complexity O(n)
}
