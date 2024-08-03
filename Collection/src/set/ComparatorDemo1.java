package set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts = new TreeSet();
ts.add("C");
ts.add("A");
ts.add("B");
ts.add("E");
ts.add("F");
ts.add("D");
System.out.println("ts object with default comparator: "+ts);

TreeSet tsc = new TreeSet(new StringComparator());
tsc.add("C");
tsc.add("A");
tsc.add("B");
tsc.add("E");
tsc.add("F");
tsc.add("D");
System.out.println("tsc object with custom comparator: "+tsc);


	}

}
class StringComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String aStr,bStr;
		aStr=(String) o1;
		bStr=(String) o2;
		
		return bStr.compareTo(aStr);
	}
	
}
