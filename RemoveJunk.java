
public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@#@#@ latin string 0123456789";
		
		//Regular Expression : [^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9 ]","");
		
		System.out.println(s);
	}

}
