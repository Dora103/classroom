//Program to achieve multiple inheritance
interface Abc
{
	public void show();
}
class Pqr{
	static int i = 20;
}
class MultipleInher extends Pqr implements Abc{
	public void show(){
		System.out.println(" I am in abc ");
	}

	public static void main(String[] args) {
		Abc a;
		MultipleInher z= new MultipleInher();
		a = z;
		a.show();
		System.out.println(i);
	}
}