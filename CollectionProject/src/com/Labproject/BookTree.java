/* Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of treeset */

package com.Labproject;

import java.util.ArrayList;
import java.util.TreeSet;

public class BookTree {

	public static void main(String[] args) {
		//create list1
	    ArrayList<Book> list1=new ArrayList<>();

	    Book bt1 = new Book(45678, "Software Engeering", "Rk.Raman");
	    Book bt2 = new Book(56366, "Data structure", "Suman Wadhwa");
	    Book bt3 = new Book(45678, "MIS", "Piyush Goyal");
	    //adding obj in arraylist
	    list1.add(bt1);
	    list1.add(bt2);
	    list1.add(bt3);

	    System.out.println("List1 is: " + list1);

	    //create list2
		ArrayList<Book> list2=new ArrayList<>();

		Book bt4 = new Book(45678, "LOC", "Rk.Raman");
	    Book bt5 = new Book(56366, "Data Structure-2", "Suman Wadhwa");
	    Book bt6 = new Book(45678, "c++", "Piyush Goyal");
	    //adding obj in arraylist
	    list2.add(bt4);
	    list2.add(bt5);
	    list2.add(bt6);

	    System.out.println("List2 is: " + list2);

	    TreeSet<Book> t=new TreeSet<>();
	    t.addAll(list1);
	    t.addAll(list2);

	    //find first element of the tree set

	    System.out.println("First element is: " + t.first());

	    //find the last element of the tree set

	    System.out.println("Last element is: " + t.last());


	}

}
