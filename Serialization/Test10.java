//deserialization

import java.io.*;

class Test10{
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e1 = (Emp)ois.readObject();
		System.out.println("Eno "+e1.eno);
		System.out.println("Ename "+e1.ename);
		System.out.println("Deserialization is completed");
	}
}