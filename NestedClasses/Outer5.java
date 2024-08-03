//Static nested classes: can allow only static members of outer class but non-static 
class Outer5{
	static int n1=11;
	static int n2=22;
	static class Inner{
		void show()
		{
			System.out.println(n1);
			System.out.println(n2);
		}
	}
	public static void main(String[] args) {
		//Outer5.Inner i = new Outer5.Inner();
		//i.show();
		new Outer5.Inner().show();

	}
}