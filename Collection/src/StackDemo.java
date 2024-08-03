import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> s = new Stack<String>();
s.push("Raj");
s.push("Pravin");
s.push("Manoj");
System.out.println(s);
System.out.println(s.search("Manoj"));
System.out.println(s.size());
System.out.println(s.peek());
s.pop();
System.out.println(s);
System.out.println(s.isEmpty());
s.clear();
System.out.println(s.isEmpty());
	}

}
