package Threads;

public class WithoutThread extends Thread{

	public void run()//here we can not add throws extception bcz it is an override method from Thread class
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Fun");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WithoutThread t = new WithoutThread();
		WithoutThread t = new WithoutThread();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}

}
