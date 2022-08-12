           /* W.A.P to remove all the white spaces from a string */

public class RemoveWhiteSpace { 
   
    public static void main(String[] args) {    
            
        String str1="Remove all white spaces";    
            
        //Removes the white spaces using regex 
   
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
} 

output:--
String after removing all the white space : Removeallwhitespaces   