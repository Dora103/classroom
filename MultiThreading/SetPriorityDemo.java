//Program to demonstrate getPriority() and setPriority()
class SetPriorityDemo extends Thread
{
	public void run()
	{
		System.out.println("Inside run method");
	}
	public static void main(String[] args) {
		SetPriorityDemo  t1 = new SetPriorityDemo();
		SetPriorityDemo  t2  = new SetPriorityDemo();
		SetPriorityDemo  t3 = new SetPriorityDemo();

		System.out.println("t1 thread priority :"+t1.getPriority());
		System.out.println("t2 thread priority: "+t2.getPriority());
		System.out.println("t3 thread priority: "+t3.getPriority());
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("t1 thread priority :"+t1.getPriority());
		System.out.println("t2 thread priority: "+t2.getPriority());
		System.out.println("t3 thread priority: "+t3.getPriority());

		//Main Thread
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());

		//Main THread priority is set to 10
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());


	}
}