//Inside the interface it is possible to declare the default & static methods from java 8 version.
interface I1{
	void m1();
default void m2(){
	System.out.println(" default method");
}
static void m3(){
	System.out.println("static method");
}
}

class DefaultAndStaticMethod implements I1{
	public void m1()
	{
		System.out.println("abstarct method");
	}
	public static void main(String[] args) {
		DefaultAndStaticMethod t = new DefaultAndStaticMethod();
		t.m1();
		t.m2();
		I1.m3();
	}
}