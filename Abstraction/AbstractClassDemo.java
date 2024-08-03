//Program for absract and non-abstract methods
abstract class Test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println(" M4");
	}
}
class AbstractClassDemo extends Test{
	void m1()
	{
		System.out.println("M1");
	}
	void m2()
	{
		System.out.println("M2");
	}
	void m3()
	{
		System.out.println("M3");
	}
	public static void main(String[] args) {
		AbstractClassDemo a = new AbstractClassDemo();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

		Test t = new AbstractClassDemo();
		t.m1();
		t.m2();
		t.m3();
		t.m4();

	}
}