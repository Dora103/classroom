//Program to merge data of two files into third file

import java.io.*;

class MergeFileData{
	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line = br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("abc.txt"));
		line = br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}
}