//If interface contains same default method then we can override that method in implementation class.

interface I1{
	default void m1()
	{
		System.out.println("I1 m1() method");
	}
}
// interface I2{
// default void m1()
// 	{
// 		System.out.println("I2 m1() method");
// 	}
// }
class OverrideDefaultMethod implements I1,I2{
	public void m1()
	{
		System.out.println("m1 method common implementation");
	}
	public static void main(String[] args) {
		new OverrideDefaultMethod().m1();
	}
}