import java.io.*;
class ExceptionMethodOvld{
	void method1(ArithmeticException ae){
		System.out.println(ae);
	}
	void method1(IOException io){
		System.out.println(io);
	}
	public static void main(String[] args) {
		ExceptionMethodOvld e = new ExceptionMethodOvld();
		e.method1(new ArithmeticException());
		e.method1(new IOException());
	}
}