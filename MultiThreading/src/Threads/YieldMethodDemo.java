package Threads;

class A1 extends Thread{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			
			System.out.println("A Thread");
			yield();
		}
	}
}
class B extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("B Thread");
		}
	}
}

public class YieldMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 a = new A1();
B b = new B();

a.start();
b.start();
	}

}
