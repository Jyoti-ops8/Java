/* Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12 */

public class Array {
    
	public static void con(String str[],int arr[]) {
		
		System.out.println("Names\Values\n");
		
		for(int i=0;i<str.length;i++)
		{
				System.out.println(str[i]+"\t"+arr[i]);
		}
	}

 
	public static void main(String[] ab) {
        //Array 
		String s[] = {"Rishi","Jyoti","Jai","Neha","Ritu"};
		
        //Array of Values
		int val[] = {6,11,14,26,4};
		
        //Calling method
		con(s,val);
	}
}

