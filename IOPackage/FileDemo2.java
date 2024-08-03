//Creation of directory
import java.io.*;
class FileDemo2{
	public static void main(String[] args) throws IOException{

		//creation of file
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

		//creation of directory
		File f1 = new File("ashu");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());

		//creation of file inside the directory( directory must present)
		File f2 = new File("ashu","ashu1.txt");
		f2.createNewFile();
	}
}