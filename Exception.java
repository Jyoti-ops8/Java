           /* First assigment */

import java.util.Scanner;

public class Exception {
   public static void main(String[] args) {

      //take input from the user as string
      Scanner sc = new Scanner(System.in);
      
      int i1,i2,res;
      System.out.println("Enter the value of n1:");
      String n1 = sc.next();
 
      System.out.println("Enter the value of n2:");
      String n2 = sc.next();  
       
      try {
          i1=Integer.parseInt(n1);
          i2=Integer.parseInt(n2);

          res = i1/i2;
          System.out.println("Result: " + res );
     }

     catch(NumberFormatException e) {
         System.out.println("Format Mismatch");
     }

     catch(ArithmeticException ae) {
         System.out.println("Invalid Division");
     }
     
     catch(IllegalArgumentException i) {
         System.out.println("Exception encountered");
     }

     finally {
         System.out.println("Exception Handling Completed");
     } 
   }
}
    
