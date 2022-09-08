public class MainStudent {
	public static void main(String[] args) {
		
		Student st = new Student();
		System.out.println("Your Rollnumber is : " + st.getRollnumber());
		st.setRollnumber(919111);
		System.out.println("Your name is : " + st.getName());
		st.setName("Jyoti");
		System.out.println("Your name is : " + st.getAge());
		st.setAge(20);
		
	}

}
