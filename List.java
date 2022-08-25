     /* Write a method that takes a String and returns a String of the
same length containing the 'X' character in all positions except the
last 4 positions. The characters in the last 4 positions must be the
same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678" */

import java.util.Scanner;

class Strings{

	public void list() {
                //take input form the user 
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter value:");
                String s=sc.nextLine();

	        if (s.length() > 4) {
	             String repeat = s.substring(0, s.length()-4);
	            
	            repeat = "X".repeat(s.length()-4);
	            repeat += s.substring(s.length()-4);
	            System.out.println(repeat);
	        }
	        else {
	            System.out.println("Entered string must be greater than 4.");
	        }

	}
   
}

public class List {

 public static void main(String[] args) {

Strings obj = new Strings();
obj.list();
}
}
