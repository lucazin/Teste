package Array;
public class maximumSubarray {

    
    public static void main(String[] args) {
        // lets run our functions

        //Integer[] arr = {-2,1,-3,4,-1,2,1,-5,4}; //9

        Integer[] arr = {1,-2,3};

        //find maximum subarray that max sum of itens
        //look the size the of array
        // size -1  / 2  find de middle
        // iterate over left and find the max sum
        // interate over right and find the max sum
        // sum the max values right , left and middle
        //return the sum



         // Initialize our variables using the first element.

         
        //  int currentSubarray = nums[0];
        //  int maxSubarray = nums[0];
         
        //  // Start with the 2nd element since we already used the first one.
        //  for (int i = 1; i < nums.length; i++) {
        //      int num = nums[i];
        //      // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
        //      currentSubarray = Math.max(num, currentSubarray + num);
        //      maxSubarray = Math.max(maxSubarray, currentSubarray);
        //  }
         
        //  return maxSubarray;

       
        int size = arr.length;
       
        int array_size_sides = 0;

        if(size % 2 ==0)
          array_size_sides = (size)/2;
        else
          array_size_sides = (size-1)/2;

        int MiddleIndex = array_size_sides;

        //find maxsub left side;

        int bestmaxleft = 0;
        int currentleft = 0;
        int MaxValuLeftFind = 0;
        int aux_maxleft = 0;

        for(int i = array_size_sides-1;i>=0;i--)
        {
            currentleft = arr[i];
            if(arr[i] >= MaxValuLeftFind)
            {
                currentleft = arr[i];
                MaxValuLeftFind = currentleft;
            }
                
            aux_maxleft += Math.max(arr[i], arr[i]);
            if(aux_maxleft > bestmaxleft)
                bestmaxleft = aux_maxleft;
        }
         
        MaxValuLeftFind = MaxValuLeftFind - bestmaxleft;

        int bestmaxright = 0;
        int currentright = 0;
        int MaxValuerightFind = 0;
        int aux_maxRight = 0;


        for(int i = MiddleIndex+1; i <= size-1; i++)
        {
            currentright = arr[i];
            if(arr[i] >= MaxValuerightFind)
            {
                currentright = arr[i];
                MaxValuerightFind = currentright;
            }
                
            aux_maxRight += Math.max(arr[i], arr[i]);
            if(aux_maxRight > bestmaxright)
                 bestmaxright = aux_maxRight;
        }
         
        MaxValuerightFind = MaxValuerightFind - bestmaxright;

        int MaxSumSubArray =  bestmaxleft + bestmaxright + arr[MiddleIndex];

        System.out.println(MaxSumSubArray);
    }
}
