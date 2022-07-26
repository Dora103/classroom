class StringConstructor{
	
	public static void main(String[] args)
	{
		String str = "help4code";
		String s1 = new String(str);
		System.out.println(s1);

		char[] ch = {'h','e','l','p','4','c','o','d','e'};
		String s2 = new String(ch);
		System.out.println(s2);

		char[] ch1 = {'h','e','l','p','4','c','o','d','e'};
		String s3 = new String(ch,2,6);
		System.out.println(s3);

		byte[] b = {65,66,67,68,69,70};
		String s5 = new String(b);
		System.out.println(s5);

		byte[] b1 = {65,66,67,68,69,70};
		String s6 = new String(b,2,4);
		System.out.println(s6);

	}
}