//program for overloading interface methods
interface It1{
	double m1(int a,String str);
	int m1(char ch);
}
class OverloadIntfMethod implements It1{
	//overloaded methods
	public double m1(int a, String str)
	{
		System.out.println("m1 2-arguments method");
		return 22.2;
	}
	public int m1(char ch){
		System.out.println("m1 1-argument method");
		return 40;
	}
	public static void main(String[] args) {
		OverloadIntfMethod t = new OverloadIntfMethod();
		int i = t.m1('p');
		System.out.println("Value="+i);
		double d= t.m1(22,"Raj");
		System.out.println("Value="+d);
	}
}