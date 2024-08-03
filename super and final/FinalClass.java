//final class
class A{
	
}
class FinalClass extends A{ //we cannot inherit final
	void demo(){
		System.out.println("I am in A");
	}
	public /*static*/ void main(String[] args) {
		FinalClass fc= new FinalClass();
		fc.demo();
	}
}