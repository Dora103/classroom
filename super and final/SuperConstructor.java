//Program to use super at constructor level
class Person{
	Person(){
		System.out.println("This is Person class Constructor");
	}
}
class Student extends Person{
	Student(){
		super();
		System.out.println("This Student class Constructor");
	}
	
}
class SuperConstructor{
	public static void main(String[] args) {
		Student s = new Student();
	}


	
}