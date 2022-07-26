class StringBufConv{
	
	public static void main(String[] args)
	{
		//conversion String to StringBuffer
		String str1 = "Ashish";
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(sb);

		//conversion StringBuffer to String
		StringBuffer sb2 = new StringBuffer("Ashish");
		String str2 = sb2.toString();
		System.out.println(str2);

	}
}