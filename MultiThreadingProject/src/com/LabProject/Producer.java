/* Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct */

package com.LabProject;

import java.util.Scanner;

public class Producer extends Thread {
	static int availableProduct;
	
	public void run() {
		demand(10);
		supply(15);
	}
	
	void demand(int n) { 
		try {
			if(n>availableProduct) {
				System.out.println(Thread.currentThread().getName()+" Consumer should wait till supply increases the availableProduct");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void supply(int n) {
		if(n<availableProduct) {
			System.out.println(Thread.currentThread().getName()+" process execute");
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(); //demanding number or product
			
			Producer p1 = new Producer();
			Producer p2 = new  Producer();
			
			p1.setName("Thread A");
			p2.setName("Thread B");
			
			p1.demand(10);
			p2.supply(15);
			
			if(n>availableProduct) {
				try {
					p1.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				catch(IllegalMonitorStateException ie) {
					ie.getStackTrace();
				}
			}else {
				p1.start();
			}
			
			p2.start();
			
		}
		
	}

}
