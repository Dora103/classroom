package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h = new HashSet<String>();
h.add("A");
h.add("B");
h.add("C");
System.out.println(h.add("D"));
System.out.println(h.add("D"));

Iterator<String> itr = h.iterator();
while(itr.hasNext())
{
	String str = itr.next();
	System.out.println(str);
}
System.out.println(h);
	}

}
