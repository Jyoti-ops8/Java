/* Write a program for to check a palindrome string.
Write test cases for 4 different parameters (use @parametrizedTest annotaion) */

package LabTestOnJunit;

class CheckPali {

  public static boolean palindrome(String s) {

    String reverseStr="";
    
    int sLength=s.length();

    for(int i=sLength-1; i>=0; --i) {
      reverseStr = reverseStr + s.charAt(i);
    }

    if(s.equals(reverseStr)) {
      return true;
    }

    else {
      return false;
    }
  }
}
