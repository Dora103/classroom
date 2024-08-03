//serialization

import java.io.*;
class Emp implements Serializable{
	int eno;
	String ename;
	public Emp(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
}
class Test9{
	public static void main(String[] args) throws IOException {
		Emp e = new Emp(111,"Ashish");
		FileOutputStream fout = new FileOutputStream("student.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(e);
		System.out.println("serialization is fcomplete");
	}
	
}