//user defined exception, throw keyword
class UserDefinedExcep{
	static void checkAge(int age){
		if(age>18){
			System.out.println("Eligible for marry");
		}
		else{
			throw new ArithmeticException("Not Eligible for marry");
		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter age");
		int a = sc.nextInt();
		UserDefinedExcep.checkAge(a);
	}
}