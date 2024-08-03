class PrintException{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
}
/*E:\JavaPrograms\ExceptionHandling>java PrintException
java.lang.ArithmeticException: / by zero
/ by zero
java.lang.ArithmeticException: / by zero
        at PrintException.main(PrintException.java:4)*/