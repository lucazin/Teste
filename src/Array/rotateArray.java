package Array;
import java.util.Arrays;

public class rotateArray {


    
    public static void main(String[] args) {
        

        // Time Complexity = O(n)
        //Space Complexity = O(n) 
 
        int[] arr = {1,2,3,4,5,6,7};
        int moves_k = 2;
        
        int count = 1;
        while(count <= moves_k)
         {
            moveValueAtIndexToFront(arr, arr.length-1);
            count++;
         }

        System.out.println(Arrays.toString(arr)); 
    }

    public static void moveValueAtIndexToFront(int[] arrayToBeShifted, int index) 
    {
        int valueBeingMoved = arrayToBeShifted[index];
      
        for (int i = index; i > 0; i--) {
          arrayToBeShifted[i] = arrayToBeShifted[i-1]; // andando pra frente  4 -> 5 / 3 - > 4 / 2 -> 3 / 1 -> 2 / 0 - > 1
        }
      
        arrayToBeShifted[0] = valueBeingMoved; // adiciono o index 0
      
        //return arrayToBeShifted;
      }



    //   int[] taco = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    //   int index = 5;
    //   int temp = taco[index];
    //   for(int i = index; i > 0; i--) {
    //       taco[i] = taco[i-1];
    //   }
    //   taco[0] = temp;


    // public void rotate(int[] nums, int k) {
    //     int[] a = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //       a[(i + k) % nums.length] = nums[i];
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //       nums[i] = a[i];
    //     }
    //   }

//     Step 1 - 12345 6789 ---> 54321 6789

// Step 2 - 54321 6789 ---> 54321 9876

// Step 3 - 543219876 ---> 678912345

}
