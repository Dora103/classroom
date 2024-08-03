//Program to write text or character data to file

import java.io.FileWriter;
import java.io.IOException;

class FileWriter1{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("1234");
		fw.write("\n");
		fw.write("help4code eLearning");
		fw.write("\n");
		char []ch = {'a','b','c','d','e'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
	}
}