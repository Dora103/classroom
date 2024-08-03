package Threads;

import java.util.Scanner;

class BankAppDemo extends Thread{
	static int bal;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance");
		bal = sc.nextInt();

	}


	synchronized static void withdraw(int amt)
	{
		System.out.println(Thread.currentThread()+" is waiting");
		if(bal<amt)
		{
			System.out.println("Insufficient balance in Account");
		}
		else {
			bal = bal-amt;
			if(bal<=5000)
			{
				System.out.println("Minimum balance in Account" +" must be Rs.5000 "+ Thread.currentThread());
			}
			else {
				System.out.println("Transcation successful by "+Thread.currentThread()+" Balance is "+bal);

			}
		}
	}

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2500);
				withdraw(2500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}
public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAppDemo b1 = new BankAppDemo();
BankAppDemo b2 = new BankAppDemo();
b1.setName("Ram");
b2.setName("Shyam");
b1.get();
b2.get();
b1.start();




b2.start();
	}

}
