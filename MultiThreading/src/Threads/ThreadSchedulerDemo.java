package Threads;
class A extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadSchedulerDemo {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		A t1 = new A();
		A t2 = new A();
		A t3 = new A();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t1.join();
	
		t2.start();
		t2.join();
		t3.start();
		
	}

}
