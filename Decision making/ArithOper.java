//Accept two in tegers and perform arithmetic operations.
import java.util.Scanner;
class ArithOper{
	
	public static void main(String []args){

	Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers");
	double num1,num2,total;
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for multiplication, 4 for Division, 5 for modulus");
    int oper = sc.nextInt();

	switch(oper)
	{
      case 1 : System.out.println("Addition = " + (num1+num2));
      break;
      case 2 : System.out.println("Substraction = "+(num1-num2));
      break;
      case 3 : System.out.println("Multiplication = "+(num1*num2));
      break;
      case 4 : System.out.println("Divison = "+(num1/num2));
      break;
      case 5 : System.out.println("Mod = "+(num1%num2));
      break;

	}
	}
}