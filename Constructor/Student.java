//create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '120' and name as "Ashish" by creating an object of the class Student.

class Student{
	
	String name ;
	int roll_no;
	public static void main(String[] args)
	{
	 
	 Student student = new Student();

	 student.name = "Ashish";
	 student.roll_no = 120;

	 System.out.println("Name :"+student.name+" and Roll No. :"+student.roll_no);


	}
}