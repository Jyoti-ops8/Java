           /* First assigment */

import java.lang.ArithmeticException;
import java.util.Scanner;

public class Exception {
   public static void main(String[] args) {

      //take input from the user as string
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the value of n1:");
      int n1 = sc.nextInt();
 
      System.out.println("Enter the value of n2:");
      int n2 = sc.nextInt();  
       
      try {

      int n3 = n1/n2;
   
      if(n2>0) {
         System.out.println("divison of two number is:"+n3);
      }
      
      else {
         System.out.println("invalid division");
      }
      }

      catch(ArithmeticException e) {
         System.out.println(e);
      }
      
         System.out.println("Exception Handling Completed");
   }
}
    
