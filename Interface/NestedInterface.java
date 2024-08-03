//Nested interface: Declaring interface inside the another interface
interface I1{
	void m1();
	interface I2
	{
		void m2();
	}
};
class NestedInterface implements I1,I1.I2
{
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		NestedInterface t = new NestedInterface();
		t.m1();
		t.m2();
	}
}