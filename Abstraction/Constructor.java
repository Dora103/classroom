//Inside the abstract class we can declare the constructor
//abstract class constructor is executed but object is not created 
abstract class Test {
	Test()
	{
		System.out.println(" Abstract class constructor");
	}
}
class Constructor extends Test {
	Constructor()
	{
		System.out.println("Normal class constructor");
	}
	public static void main(String[] args) {
		new Constructor();
	}
}