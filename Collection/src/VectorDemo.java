import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v = new Vector();
System.out.println("Capacity: "+v.capacity());
v.addElement("A");
System.out.println("Capacity: "+v.capacity());
System.out.println(v);
for(int i=1;i<=10;i++)
{
	v.addElement(i*10);
}
System.out.println(v);
System.out.println("New Capacity: "+v.capacity());
	}

}
