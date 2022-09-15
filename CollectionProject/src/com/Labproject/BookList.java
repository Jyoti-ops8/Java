 /* WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print(using foreach loop or iterator) elements of both ArrayLists one on one line */

package com.Labproject;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {

		//create list1
	    ArrayList<Book> list1=new ArrayList<>();

	    Book b1 = new Book(45678, "Software Engeering", "Rk.Raman");
	    Book b2 = new Book(56366, "Data structure", "Suman Wadhwa");
	    Book b3 = new Book(45678, "MIS", "Piyush Goyal");
	    //adding obj in arraylist
	    list1.add(b1);
	    list1.add(b2);
	    list1.add(b3);

	    //create list2
		ArrayList<Book> list2=new ArrayList<>();

		Book b4 = new Book(45678, "LOC", "Rk.Raman");
	    Book b5 = new Book(56366, "Data Structure-2", "Suman Wadhwa");
	    Book b6 = new Book(45678, "c++", "Piyush Goyal");
	    //adding obj in arraylist
	    list2.add(b4);
	    list2.add(b5);
	    list2.add(b6);

	    //traversing list through for-each loop

		for(Book b:list1) {
			System.out.println("Elements of list1: " + b);
		}

		for(Book b:list2) {
			System.out.println("Elements of list2: " + b);
		}

	}




}
