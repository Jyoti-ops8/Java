/* WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103 */

package com.Labproject;

import java.util.HashMap;
import java.util.Map;

public class StudentMap  {

	public static void main(String[] args) {
		//create hashmap
		HashMap<Integer, String> map=new HashMap<Integer, String> ();

		//put integer(id) as key and String(name) as value in map
		map.put(101, "Anshul");
		map.put(102, "Ashok");
		map.put(103, "Ritik");
		map.put(104, "Mahak");
		map.put(105, "Bela");

		for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()) {

				System.out.println(m.getKey()+" "+m.getValue());

		}

	}

}