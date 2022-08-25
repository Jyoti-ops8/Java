/* Write a method that takes a String[] as an argument and returns a String containing the concatenation of all the
  strings in the input array. Invoke your method 3 times with different arguments. Make sure that your code handles 
  the cases where the argument is null */

public class Concate {
        //accepting a String array from user
	static String strConcat(String[] ab) {
		
                //converting st array int StringBuilder object, for using append method
		StringBuilder build = new StringBuilder();
		
		try {
                       //throwing an exception when st is empty
			if(sr==null) {
				throw new Exception();
			}

                        //join array values one by one using for each loop
			for(String s : sr) {
                               //append string one by on at the end of builder obj
				build.append(s+" ");
			}
		}
		catch(Exception e) {
			
                        //this will print a msg when string is null
			System.out.print("Array Cannot Null");
		}
                //return
		return build.toString();
	}
	public static void main(String[] ab) {
        //make three array of Strings
		String sr1[]= null;
		String sr2[]= {"second argument"};
		String sr3[]= {"third argument"};

		System.out.println(strConcat(sr1));
		System.out.println(strConcat(sr2));
		System.out.println(strConcat(sr3));
		}
		}


}
