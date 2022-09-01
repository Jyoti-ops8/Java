/* Write a program to print table of any number input by user */

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice:");
		
		int n = s.nextInt();
		for(int i=1; i<=10; i++) {
			int c=i*n;
			System.out.println("Table is:" + c);
		}
		
	}
}
	
