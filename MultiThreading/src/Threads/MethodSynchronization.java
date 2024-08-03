package Threads;
class TableDemo{
	synchronized void show(int x) throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{

			Thread.sleep(1500);
			System.out.println(i*x);
		}
	}
}

class One extends Thread{
	TableDemo t;
	One(TableDemo t)
	{
		this.t = t;
	}
	public void run()
	{
		try {
			t.show(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Two extends Thread{
	TableDemo t;
	Two(TableDemo t)
	{
		this.t = t;
	}
	public void run()
	{
		try {
			t.show(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class MethodSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableDemo d = new TableDemo();
		One o = new One(d);
		o.start();
		Two t = new Two(d);
		t.start();
	}

}
