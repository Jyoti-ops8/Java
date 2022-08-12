            /* W.A.P to find factorial of a number */

import java.util.Scanner;

class Factorial {

  public static void main(String[] ab) {

     int i,fact=1;
     
     System.out.println("Enter the number: ");

     //Scanner class for input number to calculate factorial
     Scanner s=new Scanner(System.in);
     int number=s.nextInt();

     for(i=1; i<=number; i++){
     fact=fact*i;

     }

     System.out.println("Factorial of " + number + " is: " + fact);

  }

}


output:--
Enter the number:
6
Factorial of 6 is: 720



