import java.util.Scanner;

public class Square implements Shape {
	
	int length; 
	
	public void area() {
		
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter length of Square : ");
			length=sc.nextInt();
		
		int areaA=length*length;
		System.out.println("Area of Square is : " + areaA);
	}

}


