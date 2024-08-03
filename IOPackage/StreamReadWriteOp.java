//byte stream read write operation in java
import java.io.*;
class StreamReadWriteOp
{
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("xyz.txt");

		int c;
		while((c=fis.read())!=-1)
		{
			fos.write(c);
			System.out.println((char)c);
		}
		System.out.println("read write is done");
		fis.close();
		fos.close();
	}
}