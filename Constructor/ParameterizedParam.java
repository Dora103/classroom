class Demo{
	
	//data members of the class
	String name;
	int id;

	//parameterized constructor
	Demo(String name, int id)
	{
	 	this.name = name;
	 	this.id = id;
	}
}
class ParameterizedParam{
	
	public static void main(String[] args)
	{
	  //this would invoke parameterized constructor.
	  Demo Demo1 = new Demo("Ashish",1);
	  System.out.println("DemoName :" + Demo1.name + " and DemoId :" + Demo1.id);
	 }
	}
	
