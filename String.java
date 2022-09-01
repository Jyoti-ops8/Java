/* Write a program to count number of char in a string entered by user excluding space */

import java.lang.String;
import java.util.Scanner;

public class String {

	public void num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement:");
		
		String str = sc.nextLine();
		int countchar = 0;    
        
        //Counts each character except space    
        for(int i=0; i<str.length(); i++) {    
            if(str.charAt(i) != ' ')    
             countchar++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + countchar);
		
	}
	
	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(java.lang.String[] args) {
		String st = new String();
		st.num();
		

	}

}
