package HashTable;
import java.util.HashMap;
import java.util.Map;

public class ConfusingNumber {
 
    public static void main(String[] args) {
               
        System.out.println(ConfusingNumberRightWay(910));
    }

    public static boolean ConfusingNumberRightWay(int n)
   {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
        if(c == '2' || c == '3' || c == '4' || c == '5' || c == '7') return false;
        
        if(c == '6')
            sb.append('9');
        else if(c == '9')
            sb.append('6');
        else
            sb.append(c);
        } 
        return !sb.reverse().toString().equals(s);
   }

   
   public static boolean ConfusingNumber_Almost(int n)
   {
       if(n == 1 || n == 0)
           return false;

       String num = String.valueOf(n);
       char[] arr = num.toCharArray();

       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       map.put(6, 9);
       map.put(9, 6);
       map.put(0, 0);
       map.put(1, 1);
       map.put(8, 8);

       int find = 0;
       
       if((arr.length > 1 && arr[0] == arr[1]))
           return false;
       else
       {
           for(int i=0;i<=arr.length-1;i++)
           {
               if(map.containsKey(Integer.parseInt(String.valueOf(arr[i]))))
               find++;
           }

           if( (find == arr.length)  )
           {
               int count = 0;
               while(count < arr.length-1)
               {
                   if(arr.length > 2 && (arr[count] == '1' || arr[count] == '0'))
                       return false;
                   else
                       count++;
               }
               return true;
           }
           else
               return false;
       }
   }



   
   

}
