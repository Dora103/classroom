//Program to read data from file
import java.io.*;
class BufferedReaderDemo{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		try{
			String line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(Exception e)
		{
			br.close();
		}
	}
}