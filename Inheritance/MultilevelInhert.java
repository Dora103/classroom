//WAP to demonstrate multilevel inheritance
class Student{
	protected int rollno;
public void setRollno(int r){
	rollno=r;
}
public void getRollno(){
	System.out.println("Roll No"+rollno);
}
};
class Marks extends Student{
	protected int sub1,sub2;
	public void setMarks(int m1,int m2){
		sub1 = m1;
		sub2 = m2;
	}
	public void getMarks(){
		System.out.println("Subject 1"+sub1);
		System.out.println("Subject 2"+sub2);
	}
};
class Result extends Marks{
	int tot;
	public void display(){
		tot = sub1 + sub2;
		getRollno();
		getMarks();
		System.out.println("Total "+tot);
	}
};

class MultilevelInhert{
public static void main(String[] args) {
		Result r = new Result();
		r.setRollno(10);
		r.setMarks(55,66);
		r.display();
	}	
}