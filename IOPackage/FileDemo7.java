import java.io.*;
class FileDemo7{
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		try{
			bis = new BufferedInputStream(new FileInputStream("img1.jfif"));
			bos = new BufferedOutputStream(new FileOutputStream("ashu/img2.jfif"));

			while((c=bis.read())!=-1)
			{
				bos.write(c);
			}
			System.out.println("read write is done");
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			bis.close();
			bos.close();
		}
	}
}