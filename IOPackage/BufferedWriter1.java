//Program to write data to the file
import java.io.*;

class BufferedWriter1{
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write("1234");
		bw.newLine();
		char []ch = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Java Trainer");
		bw.flush();
		bw.close();
	

	}
}