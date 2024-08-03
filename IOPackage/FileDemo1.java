//creation of physical file

import java.io.*;
class FileDemo1
{
   public static void main(String[] args) throws IOException{
   	File f = new File("abc.txt");
   	boolean b = f.createNewFile();
   	if(b)
   		System.out.println("file created");
   	else 
   		System.out.println("file aready exist");
   }
}