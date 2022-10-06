/* Write a program for addition() and multiplication() of two numbers.
Write test cases for each of these methods */

package LabTestOnJunit;

import static org.junit.Assert.assertEquals;
 
import org.junit.Test;

public class TestAddMul {
     //Addition

     @Test
     public void AddTest() {
    	     assertEquals(31,AdditionMultiplication.Addition(11,20));
    	   
     }
     //Multiplication

     @Test
     public void MulTest() {
    	     assertEquals(220, AdditionMultiplication.Multiplication(11,20));
    
     }
}