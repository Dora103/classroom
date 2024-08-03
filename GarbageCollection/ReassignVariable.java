//Whenever we are reassigning the reference variable, then objects are automatically eligible for GC
class ReassignVariable
{
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Mohit");
		StringBuffer s2 = new StringBuffer("Rajat");
		s1 = s2 ;
		System.out.println(s1);
		System.out.println(s2);
	}
}