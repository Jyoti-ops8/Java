/* Write a JAVA program which will generate two threads:(Use Synchronization)
- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order */

package com.LabProject;

public class FiboRevThread extends Thread {
	
	public void run() {
		printFiboSeries(10);
	}
	
	synchronized public static void printFiboSeries(int n) {
		System.out.println(Thread.currentThread().getName() + " Fibonacci Series till " + n + " terms: ");
		
		System.out.println(Thread.currentThread().getName() + " Synchronized start: ");
		
		try {
		int n1 = 0, n2 = 1;
		
	    for (int i = 1; i <= n; i++) {
	    	
		    System.out.println(n1);
		     // compute the next term
		     int n3 = n1 + n2;
		     n1 = n2;
		     n2 = n3;
	    }
	    
	    int a[] = new int[n];
	     
        // assigning first and second elements
        a[0] = 0;
        a[1] = 1;
     
        for (int i=2; i<n; i++) {
            // storing sum in the location
            a[i] = a[i-2] + a[i-1];
        }
        
        System.out.println("In Reverse order: ");
        for (int i=n-1; i>=0; i--) {
            // print array in reverse order
        	
            System.out.print(a[i] +" \n");
        }
        
	    System.out.println(Thread.currentThread().getName() + " Synchronized end. ");
		}
	    catch(ArrayIndexOutOfBoundsException ae) {
	    	ae.getStackTrace();
	    }
	}
	

	public static void main(String[] args) {
		FiboRevThread f1 = new FiboRevThread();
		FiboRevThread f2 = new FiboRevThread();
		
		f1.setName("Thread 1");
		f1.start();
		
		f2.setName("Thread 2");
		f2.start();
	
	}

}
