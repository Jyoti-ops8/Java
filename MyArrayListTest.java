/* Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.*/
	
package LabTestOnJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyArrayListTest {	
		
        //Test for empty list.
	@Test

	public void isEmpty() {
		assertEquals(false,MyArrayList.myArrayListMain().isEmpty());
	}

        //Test  for size of arrayList
	@Test

	public void sizeOfArrayListTest() {
		assertEquals(5,MyArrayList.myArrayListMain().size());
	}
		
}