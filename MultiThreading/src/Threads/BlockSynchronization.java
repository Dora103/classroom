package Threads;
class TableDemo1{
	public void show(int x) throws InterruptedException
	{
		synchronized (this){
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			System.out.println(i*x);
		}
		}
	}
}

class One1 extends Thread{
	TableDemo1 t;
	One1(TableDemo1 t){
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
class Two1 extends Thread{
	TableDemo1 t;
	Two1(TableDemo1 t){
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
public class BlockSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableDemo1 t = new TableDemo1();
		One1 o = new One1(t);
		Two1 to = new Two1(t);
		o.start();
		to.start();
	}

}
