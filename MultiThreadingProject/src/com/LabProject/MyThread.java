/* Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers in run())Set their name and prorities */

package com.LabProject;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyThread implements Runnable {
	@Override
	public void run() throws InputMismatchException {
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("Enter three numbers: ");
			int	n=s.nextInt(); 
			int n1=s.nextInt();
			int n2=s.nextInt();
			try {
			if(n%2==0) {
				System.out.println(n + " is even number ");
			}
			else {
				System.out.println(n + " is odd number ");	
			}
			if(n1%2==0) {
				System.out.println(n1 + " is even number ");
			}
			else {
				System.out.println(n1 + " is odd number ");	
			}
			if(n2%2==0) {
				System.out.println(n2 + " is even number ");
			}
			else {
				System.out.println(n2 + " is odd number ");	
			}
			}
			catch(NoSuchElementException ne){
				ne.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Runnable r = new MyThread(); 
			
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("Thread first:");
		t2.setName("Thread second:");
		
		t1.getPriority();
		t1.start();
		t2.start();
    }
}

