package Threads;
class MyThread extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}

}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt  = new MyThread();
		mt.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}