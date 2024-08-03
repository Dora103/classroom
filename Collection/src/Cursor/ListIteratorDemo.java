package Cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.add("Ajay");
ll.add("Ganesh");
ll.add("Prashant");
ll.add("Dinesh");
System.out.println(ll);
ListIterator ltr =  ll.listIterator();
while(ltr.hasNext())
{
	String s=(String)ltr.next();
	if(s.equals("Mohan"))
	ltr.remove();
	else if(s.equals("Naresh"))
		ltr.add("Sagar");
	else if(s.equals("Prashant"))
		ltr.set("Manoj");
}
System.out.println(ll);
	}

}
