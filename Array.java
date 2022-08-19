         /* Third Assigment */

import java.lang.Exception;
import java.util.Scanner;


class Array {
	

/*makes a function for calculate sum of array elements within range
	
here int values represents array , Start and End represents first and Last Index */


      int sum(int[] values, int start,int end){
	
      try {
			
          for(int a = start; a<end; a++) {

              //loop iterating from start index to end index
		
	      sum += values[a];
             //logic for calculation Sum of array Values 
		
	  }

			
         if(start==end)
      				
         throw new IllegalArgumentException();

	
		
         if(values==null) 				
         throw new NullPointerException();

			
         if(start<0 || end>=values.length || start>end)

         //here we check multiple conditions using logical or operator

			
	 throw new ArrayIndexOutOfBoundsException();

			
         if(sum==0)

         // this exception will be generates when array does not contains any values
		
         throw new Exception();
		
     } 
		
    
     catch(IllegalArgumentException e)
 {
		
	 System.out.println("IllegalArgumentException");
		
     }
  	
	
     catch(ArrayIndexOutOfBoundsException a) 
{
	
         System.out.println("ArrayIndexOutOfBoundsException");
		
     } 

		
     catch(NullPointerException a)
 {
	
         System.out.println("NullPointerException");
	 
     }
	
	
     catch(Exception e) {
			
         System.out.println("sum is 0");
		
     }


     //return the value of sum after calculating 
		
     return sum;
	
}

	
  public static void main(String[] args) {

     //creating instance of class SumOfArray for calling its methods 

		
     Array a = new Array();

     //creating instance of class Scanner for accept values from user
	
	
     Scanner sc = new Scanner(System.in);
	
     int start,end,size;

	
     System.out.println("Enter Size of array : ");
		

     size = sc.nextInt();
	
     int arr[] =new int[size];

     //Accepting array values from user
		
     for(int i=0;i<size;i++)
{
	
		
         System.out.println("enter value of ["+i+"] index");
			
         arr[i]=sc.nextInt();
		
     }

		
     System.out.println("Enter Start index of array : ");
	
     start = sc.nextInt();

		
     System.out.println("Enter End index of array : ");
		
     end = sc.nextInt();



     //calling sum method with the help of sa instance(object)
		
     System.out.println("Sum of array elements is : "+ a.sum(arr, start, end));
	

     sc.close();
	
  }

}