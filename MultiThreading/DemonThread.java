//demon thread
class MyThread extends Thread{
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Demon Thread "+i);
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
}
class DemonThread{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		//main thread logic
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread "+i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}