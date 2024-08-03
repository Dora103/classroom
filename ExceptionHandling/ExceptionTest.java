class ExceptionTest{
	public static void main(String[] args) {
		System.out.println("Divide By Zero");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println(10/2);
			System.out.println(ae);
		}
		System.out.println("Rest of the application");
	}
}