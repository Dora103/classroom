package Threads;

public class Try {
	static int x =0 ;
	void f ()
	{
		
		x=1;
		System.out.println(x);
	//	return x;
	}
	void g()
	{
		int x=2;
		f();
		//System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try t = new Try();
		x=6;
		t.g();
//System.out.println(t.g());
//System.out.println();

	}

}
