import java.io.*;
import java.util.Scanner;
 
class CheckedException {
    public void read(){
        String val="x";
        if(val.equals("x")) {
             throw new IllegalArgumentException("not valid");
        }
    }
}
  
class Vowel {
    public void countVowels() { 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Sentence:");
        String str = sc.nextLine();
      
        char[] ch = new char[str.length()];
         int count=0;
        for (int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);

            //check if char[i] is vowel
            if (str.charAt(i) == 'a' 
                || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
               
                // count increments if there is vowel in
                // char[i]
                
                count++;
               } 
        }
 
            //Total count of vowels in string
            System.out.println("Total no of vowels in string are: " + count);
       
    }
}

public class Test{

    public static void main(String[] args){
       CheckedException c = new CheckedException();
       
       Vowel v = new Vowel();
       v.countVowels();
    }
}
