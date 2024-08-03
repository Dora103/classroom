//Normal inner class:  Declaring the class inside another class

class Outer{
	private int n1 = 11, n2 = 22;
	void show1(){
	System.out.println("Outer class show1()");
	}

class Inner{
	int i=111,j=222;
	void show2(){
System.out.println("Inner class show2()");
System.out.println(n1+n2);
System.out.println(i+j);
show1();
	}
}
}
class Test{
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show1();
		Outer.Inner i = obj.new Inner();
		i.show2();
	}
}