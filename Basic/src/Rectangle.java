import java.util.Scanner;

public class Rectangle extends Square {
	Square s=new Square();
	int width;
	public void area() {
		super.area();

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Fill your choices : ");
			
			System.out.println("Enter length of rectangle : ");
			length=sc.nextInt();
			
			System.out.println("Enter width of rectangle : ");
			width=sc.nextInt();
			
		
		
		int areaA=length*width;
		System.out.println("Area of Rectangle is : " + areaA);

	}


}

