//Program to use of final variable
class FinalVariable{
	final int MAX=89;
	void me(){
		MAX=110;//cannot change the final variable once it is intialized
	}
	public static void main(String[] args) {
			FinalVariable obj = new FinalVariable();
			obj.me();
	}
}