//Whenever we are assigning null constants to objects then objects are eligible for Garbage Collector
class NullVariables
{
	public static void main(String[] args) {
		NullVariables t1 = new NullVariables();
		NullVariables t2 = new NullVariables();
		System.out.println(t1);
		System.out.println(t2);
		t1 = null; //t1 object is eligible for GC
		t2 = null; //t2 object is eligible for GC
		System.out.println(t1);
		System.out.println(t2);
	}
}