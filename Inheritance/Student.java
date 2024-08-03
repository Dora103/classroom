class Vehicle{
	void display()
	{
		System.out.println("I am Student");
	}
}
class TwoWheeler extends Vehicle{
	void display1()
	{
		System.out.println("Two");
	}
}
class Petrol extends TwoWheeler{
	void display2()
	{
		System.out.println("Petrol");
	}
}
class Main()
{
	public static void main(String[] args) {
		
	
	Petrol pl = new Petrol();
	pl.display2();
	p1.display1();
	p1.display();
}
}
