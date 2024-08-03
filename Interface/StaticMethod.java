//Inside the interface it is possible to declare the default & static methods from java 8 version.
interface I1{
	void m1();
default void m2(){
	System.out.println(" default method");
}
static void m3(){
	System.out.println("static method");
}
}

class DefaultAndStaticMethod {
	
}