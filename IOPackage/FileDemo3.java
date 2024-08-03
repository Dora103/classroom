//Program to display files and directory present in particular folder

import java.io.*;

class FileDemo3{
	
	public static void main(String[] args) throws Exception {
		int count=0;
		File f = new File("E:\\JavaPrograms\\IOPackage");
		String s[] = f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("No. of files and directories: "+count);
	}
}