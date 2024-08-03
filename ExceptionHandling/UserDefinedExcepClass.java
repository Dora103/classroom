//creating user define exception and check eligible for marry or not
class UserDefinedExcepClass extends Exception{

	public UserDefinedExcepClass()
	{
		System.out.println("Not eligible, marry after some time");
	}

	
}
class UserException{

	static void status(int age) throws UserDefinedExcepClass
	{
		if(age>18){
			System.out.println("Eligible for marry");
		}
		else{
			throw new UserDefinedExcepClass();
		}
	}
	public static void main(String[] args) throws UserDefinedExcepClass {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		UserException.status(age);
	}
}