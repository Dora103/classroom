//Program to set name of thread
class SetName extends Thread{
	public void run(){
	 System.out.println("run() method");
	}

	public static void main(String[] args) {
		SetName t1 = new SetName();
		SetName t2 = new SetName();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());

		t1.start();
		t2.start();
		t1.setName("Ashish");
		System.out.println("After changing name of t1: "+t1.getName());
	}
}