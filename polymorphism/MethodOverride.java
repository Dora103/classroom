//Method overriding
class A{
	public int a=20;
	A(){
		System.out.println("Class A");
	}
	public void show(){
		System.out.println("Class A show");

	}
};
class B extends A{
	public int a=40;
	B(){
		System.out.println("Class B");
	}
	public void show(){
		System.out.println("Class B show");
	}
};
class MethodOverride{
	public static void main(String[] args) {
		A obj = new B();
		obj.show();
	}
}