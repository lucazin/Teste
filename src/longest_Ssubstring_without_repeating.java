import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longest_Ssubstring_without_repeating {
    
    public static void main(String[] args) {
               
       String s = "pwwkew";
       System.out.println(lengthOfLongestSubstring1(s));
    }

    public static int lengthOfLongestSubstring1(String arr) {
        
        char[] str = arr.toCharArray();
        Map<Character,Integer> map= new HashMap<Character,Integer>(); //map nao deixa duplicar

        for(int i=0; i<= str.length-1;i++)
            map.put(str[i], map.getOrDefault(str[i], 0) + 1 ); 

        return (int)(Arrays.asList(map.keySet().toArray()).stream().count());
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
       
        for (int j = 0, i = 0; j < n; j++) 
        {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}


