//final method
class ABC {
	final void demo(){
		System.out.println("ABC class final method");
	}
}
class FinalMethod extends ABC {
	void demo(){  //final method can not be overriden
		System.out.println("FinalMethod class");
	}
public static void main(String[] args) {
	FinalMethod obj = new FinalMethod();
	obj.demo();
}
}