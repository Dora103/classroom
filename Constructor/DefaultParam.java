class Demo
{
	int num;
	String name;
    
    //this would be invoked while object is created.
	Demo()
	{
	 System.out.println("Constructor called");
	}
}
class DefaultParam{
	
	public static void main(String[] args)
	{
		//this would invoke default constructor.
		Demo Demo1 = new Demo();
		//Default constructor provide the default values to the object like 0, null
		System.out.println(Demo1.name);
		System.out.println(Demo1.num);
	}
}