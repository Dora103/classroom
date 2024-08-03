//join method()
class MyThread extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException ie){}
		}
	}
}
class JoinMethod{
	public static void main(String[] args) throws Exception {
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}
}
