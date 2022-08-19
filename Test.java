          /* Second Assigment */

import java.lang.Exception;
import java.util.Scanner;
  
class Vowel {
    public int countVowels(String str) {
        int count=0;
        str=str.toLowerCase();      
        char ch[] = str.toCharArray();
         for(int i=0; i<ch.length; i++) {  

            //check if char[i] is vowel
            if (ch[i]== 'a' 
                || ch[i] == 'e'
                || ch[i] == 'i'
                || ch[i] == 'o'
                || ch[i] == 'u') {
                 
                /* count increments if there is vowel in ch[i] */    
                count++;
                } 
            if(ch[i]=='x') {
                try {
                    throw new Exception();
                }

                catch(Exception e){
                    System.out.println("letter x contain Exception");
                }
            }
        }
            //return total number of vowel
            return count;
    }
}


class Test {
   public static void main(String[] args){
         Vowel vc = new Vowel();


		
         //creating instance of class Scanner for accept values from user

		
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String : ");

		
         String s=sc.next();


		
         //calling countVowels method with the help of cv instance(object)
		
         int result = vc.countVowels(s);

	
         System.out.println("Total Number of Vowels presents : "+ result);


		
         sc.close();
   }
}
