/* Write a program for to check a Palindrome string.
Write test cases for 4 different parameters (use @parametrizedTest Annotation) */

package LabTestOnJunit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//test class
public class TestPali {

	//in this we are assigning many String values to check whether the string is palindrome or not

	@DisplayName(value="Reverse String palindrome")
	@ParameterizedTest
	@ValueSource
	(strings  = {"vovov","goog","theeth","radar"})
	
	public void palindromeTest(String s)
	{
		assertTrue(Palindrome.palindrome(s));
	}
}