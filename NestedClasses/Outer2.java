//Method local inner class
class Outer2
{
	private int a=111;
	void show1()
	{
	class Inner  //Method local inner class
	{
	void show2()
	{
System.out.println("Inner class method");
System.out.println(a);
	}
	}
	Inner i = new Inner();
	i.show2();
	}
	public static void main(String[] args) {
		Outer2 obj = new Outer2();
		obj.show1();
	}
}