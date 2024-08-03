import java.io.*;
class FileDemo6{
	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		CharArrayWriter ch = new CharArrayWriter();
		int c;
		try{
			fr = new FileReader("abc.txt");
			fw1 = new FileWriter("a.txt");
			fw2 = new FileWriter("b.txt");

			while((c=fr.read())!=-1)
			{
				ch.write(c);
			}
			ch.writeTo(fw1);
			ch.writeTo(fw2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			fr.close();
			fw1.close();
			fw2.close();
		}
	}
}