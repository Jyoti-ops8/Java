/* Write a method to find factorial of a number input by user.
factorial (in n).call this method from main() and pass argument n .
Repeat this until user enters no */

import java.util.Scanner;
import java.lang.String;

public class Factorial {
	public void number(int n) {
		int f = 1;
		String yn="yes";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		n = s.nextInt();   //it is the number input by user to calculate factorial 
		
		for(int i=1; i<=n; i++) {
			f*=i;
		}
		
		System.out.println("Factorial of n is:" + f);
		
		System.out.println("Do you want to check again");
		yn=s.next();
		while(yn.equals("yes")) {
			System.out.println("repeat again:" + yn);
		break;	
		}

       

	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		obj.number(0);

	}

}

