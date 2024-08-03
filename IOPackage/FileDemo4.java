//Program to display only file names

import java.io.*;

class FileDemo4{
	public static void main(String[] args) throws Exception
	{
	   int count=0;
	   File f = new File("E:\\JavaPrograms\\IOPackage");
	   String s[] = f.list();
	   for(String s1:s)
	   {
	       File f1 = new File(f,s1);
	       if(f1.isFile())
	       //if(f1.isDirectory())
	       {
	           count++;
	           System.out.println(s1);
	       }
	       
	   }

	   System.out.println("The total no. "+count);
	}
}