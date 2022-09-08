/* Create a class  Student with four data members and constructors-
	   Institute name---it should be static and final.
	  rollno.
	  name
	  age
	Generate getter /setter and Override toString();
	In the main class make 3 objects of Student  ...set their values and and print details */

public class Student {
	
	final private static String INSTITUTE_NAME="MATA_RAJ_KOUR";
	
	private int rollnumber;
	private String name;
	private int age;
	
	public Student() {
		super();
		this.rollnumber = 919111;
		this.name = "Jyoti";
		this.age = 20;
		
	}
	
	public Student(int rollnumber, String name, int age) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static String getINSTITUTE_NAME() {
		return INSTITUTE_NAME;
	}
	
}