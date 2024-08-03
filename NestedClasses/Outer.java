//Main method inside the outer class.

class Outer
{
	private int a=11, b=22;
	class Inner{
		int a=111, b=222;
		void show(int a, int b)
		{
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer.this.a+Outer.this.b);
		}

	}
	public static void main(String... ratan) {
		new Outer().new Inner().show(1111,2222);
	}
}