package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v = new Vector();
int sum=0;
for(int i=0;i<10;i++)
{
	v.addElement(i);
}
System.out.println(v);
Enumeration e = v.elements();
while(e.hasMoreElements())
{
	Integer in = (Integer)e.nextElement();
	if(in%2==0)
	{
		System.out.println(in);
		sum+=in;
	}
}
System.out.println(v);
System.out.println("Sum = "+sum);

	}

}
