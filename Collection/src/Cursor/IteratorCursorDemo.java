package Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
int sum=0;
for(int i=1;i<=10;i++)
{
	al.add(i);
}
System.out.println(al);
Iterator itr = al.iterator();
while(itr.hasNext())
{
	Integer in = (Integer)itr.next();
	if(in%2 == 0)
	{
		System.out.println(in);
		sum+=in;
	}
	else {
		itr.remove();
	}
}
System.out.println(al);
System.out.println("Sum = "+sum);
	}

}
