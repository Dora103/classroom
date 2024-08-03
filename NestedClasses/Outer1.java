//Constructor inside the inner & outer classes
class Outer1
{
	Outer1()
	{
System.out.println("Outer class constructor");
	}
	class Inner
	{
		Inner()
		{
			System.out.println("Inner class constructor");
		}
	}
	public static void main(String[] args) {
		new Outer1().new Inner();
	}
}