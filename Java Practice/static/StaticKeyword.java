class StaticKeyword{
	
	static int num = staticMethod();

	static 
	{
		System.out.println("Inside static block");
	}

	public static int staticMethod()
	{
		System.out.println("From static method");
		return 40;
	}

	
}
class K{
    public static void main(String[] args)
	{
		System.out.println("num = "+num);
		System.out.println("from main");
	}
	
}