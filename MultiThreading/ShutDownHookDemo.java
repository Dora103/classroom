class MyThread extends Thread{
	public void run()
	{
		System.out.println("Shutdown Hook");
	}
}
class ShutDownHookDemo{
	public static void main(String[] args) throws Exception{
		MyThread t = new MyThread();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);//adding thread to jvm hook
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
			Thread.sleep(2200);
		}
	}
}