package Array;


public class mergearrays {
    

    public static void main(String[] args) {
        

       // Time Complexity = O(n)
       //Space Complexity = O(n)

        Integer[] arr1 = {0, 3, 4, 31,20};
        Integer[] arr2 = {10, 33, 44, 54};

        Integer[] final_arr = new Integer[arr1.length+arr2.length];

        int i = 0;
        int j = 0;
        int count = 0;

        if(arr1.length > 0 && arr2.length > 0)
        {
            while(count <=final_arr.length-1)
            {
                if(i<=arr1.length-1 && arr1[i] < arr2[j])
                {
                    final_arr[count] = arr1[i];
                    i++;
                }
                else
                {
                    final_arr[count] = arr2[j];
                    j++;
                }
                count++;
            }
        }
        count = 0;
        while(count <= final_arr.length -1 )
        {
            System.out.println(final_arr[count]);
            count++;
        }
    }

}
