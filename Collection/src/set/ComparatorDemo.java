package set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet treeset = new TreeSet(new MyComparator());
treeset.add(10);
treeset.add(0);
treeset.add(15);
treeset.add(5);
treeset.add(20);
treeset.add(20);
System.out.println(treeset);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		if(I1<I2)
		return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
	
}