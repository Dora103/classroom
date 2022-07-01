//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with sepperate methods for each operation whose real and imaginary parts are entered by user.

class ComplexCalc{

int totalr=0,totali=0; 
void addComplexNum(int r1,int i1,int r2,int i2){
 	totalr = (r1+r2);
 	totali = (i1+i2);

 	System.out.println(totalr+"+"+totali+"i");
}
void subtractComplexNum(int r1,int i1,int r2,int i2){
	totalr = (r1-r2);
 	totali = (i1-i2);

 	System.out.println(totalr+"-"+totali+"i");
}

void productComplexNum(int r1,int i1,int r2,int i2)
{
	totalr = (r1*r2)+((i1*i2)*(-1));
	totali = (r1*i2)+(i1*r2);
	System.out.println(totalr+"+"+totali+"i");
}

}




class Complex{
	public static void main(String[] args){
		ComplexCalc cmp = new ComplexCalc();

	java.util.Scanner scan = new java.util.Scanner(System.in);

	System.out.println("Enter real and imaginary number");
	int real1 = scan.nextInt();
	int imaginary1 = scan.nextInt();
	int real2 = scan.nextInt();
	int imaginary2 = scan.nextInt();
	cmp.addComplexNum(real1,imaginary1,real2,imaginary2);
	cmp.productComplexNum(real1,imaginary1,real2,imaginary2);
}
}