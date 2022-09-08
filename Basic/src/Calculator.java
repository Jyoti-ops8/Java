/* Create a class Calculator with two methods add() and substract() and default and parameterized constructor
Overload theses methods-- int add(int,int)double add(double,int,int)String add(String,String) int substract(int,int) double substract(double,double */

public class Calculator {
		
		public int add(int a1,int a2) {
			
			int a=a1+a2;
			System.out.println("Addition of two numbers is : " + a);
			return a;
		}

		public double add(double n1,int n2,int n3) {
			
			double n4=n1+n2+n3;
			System.out.println("Addition of three numbers is: " + n4);
			return n4;
		}

		public String add(String s1,String s2) {
			
			String s = s1+s2;
			System.out.println("Addition of two Strings is : " + s);
			return s;
		}

		public int substract(int i1,int i2) { 
			
			int i=i1-i2;
			System.out.println("Subtraction of two numbers is : " + i);
			return i;
		}

		public double substract(double d1,double d2) {
			
			double d=d1-d2;
			System.out.println("Subtraction of two (double data type) numbers is : " + d);
			return d;
		}

		public static void main(String[] args) {
			Calculator c = new Calculator();
			c.add(35, 2);					//obj.add(int,int)
			c.add(670000, 22, 423);			//obj.add(double,int,int)
			c.add("Tony", "Stark");			//obj.add(String,String)
			c.substract(23, 12);				//obj.substract(int,int)
			c.substract(6540000, 56743); //obj.substract(double,double)

		}
}




