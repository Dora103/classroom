//ANonymous inner class: used to provide the implementation
//for normal class or abstarct class or interface
// class A{
// 	void m1(){}
// }
// class Test extends A{
// 	void m1()
// 	{
// 		System.out.println("m1 method");
// 	}
// }
class MyJava{
	public static void main(String[] args) {
		// Test t = new Test();
		// t.m1();
		new A(){
			void m1()
	{
		System.out.println("m1 method");
	}
}.m1();
	}
}