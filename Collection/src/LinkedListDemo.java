import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Ajay");
		ll.add(30);
		ll.add(null);
		
		System.out.println(ll);
		ll.set(2, "Software");
		System.out.println(ll);
		ll.add(2,"APS");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("ccc");
		System.out.println(ll);
	}

}
