//implementing interface
interface I1{
	//public, static and final
	int a = 10;
	//public and abstract methods
	void m1();
	void m2();
}
class InterfaceDemo implements I1{
	public void m1(){
		System.out.println("m1 method implementation");
		System.out.println(a);
	}
	public void m2(){
		System.out.println("m2 method implementation");
		System.out.println(a);
}
public static void main(String[] args) {
		InterfaceDemo t = new InterfaceDemo();
		t.m1();
		t.m2();
		I1 i = new InterfaceDemo();//interface variable is able to hold the implementation class object
		i.m1();
		i.m2();

	}	
}