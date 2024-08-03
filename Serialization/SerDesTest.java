//serialization and deserialization with multiple Objects
import java.io.*;
class Emp implements Serializable
{
	int eno;
	String ename;
	public Emp(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
}
class Dog implements Serializable
{
	int eno;
	String ename;
	public Dog(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
}
class Cat implements Serializable
{
}
class SerDesTest
{
	public void serialize() throws Exception {
		Emp e = new Emp(111,"Ashish");
		Dog d = new Dog(112, "Dodo");
		Cat c = new Cat();
		FileOutputStream fout = new FileOutputStream("student.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(e);
		oout.writeObject(d);
		oout.writeObject(c);
		System.out.println("serialization is completed");
	}
public void deserialize() throws Exception{
	FileInputStream  fis = new FileInputStream("student.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Emp e1 = (Emp)ois.readObject();
		Dog d1 = (Dog)ois.readObject();
		Cat c1 = (Cat)ois.readObject();
		System.out.println("Eno "+e1.eno);
		System.out.println("Name "+e1.ename);
		System.out.println("Eno "+d1.eno);
		System.out.println("Name "+d1.ename);
		System.out.println(c1);
		System.out.println("Deserialization is completed");
}
public static void main(String[] args) throws Exception {
	SerDesTest s = new SerDesTest();
	s.serialize();
	s.deserialize();
}
}