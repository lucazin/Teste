package Array;
public class reverseString {

    
    public static void main(String[] args) {
        // lets run our functions

       String Nome = "Meu nome e lucas bergamo!";
       char[] reverseStr = new char[Nome.length()];

       reverseStr = Nome.toCharArray(); 

       String reversed = "";

        for(int i= reverseStr.length-1; i>=0; i--)      
            reversed += reverseStr[i];
       

        System.out.println(reversed);

    }
}
