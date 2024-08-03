//Hirarchical inheritance
import java.util.*;

class A{
	public int x,y;
	Scanner sc = new Scanner(System.in);
	public void getdata()
	{
		System.out.println("Enter value of x and y:");
		x = sc.nextInt();
		y = sc.nextInt();
	}
};
class B extends A{
	public void product(){
		System.out.println("Product= "+(x*y));
	}
};
class C extends A{
	public void sum()
	{
		System.out.println("Sum= "+(x+y));
	}
}
class HierarchicalInherit{
	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		obj1.getdata();
		obj1.product();
		obj2.getdata();
		obj2.sum();
	}
}