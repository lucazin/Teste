
import java.util.*;

public class hasmap_uniqueocorrence {

    /**
     * @param args
     */
    public static void main(String[] args) {
               
        Integer[] arr = {1,2,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(Integer[] arr) {
        

        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>(); //map nao deixa duplicar

        for(int i=0; i<= arr.length-1;i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1 );   

            Set<Integer> set = new HashSet<>(map.values()); // set  hashset deixa ordenado
            return set.size() == map.size();
    }
  

    
}
