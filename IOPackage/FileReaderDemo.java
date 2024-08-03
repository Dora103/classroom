//character stream read write operation in java using exception handling

import java.io.*;

class FileReaderDemo{
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;

		int c;
		try{
			fr = new FileReader("abc.txt");
			fw = new FileWriter("xyz.txt");

			while((c = fr.read()) != -1)
			{
				fw.write(c);
				System.out.println((char)c);
			}
			    System.out.println("read write is done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			fr.close();
			fw.close();
		}
	}
}