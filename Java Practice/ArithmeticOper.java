//WAP using switch case for arithmatic operations on two numbers
class ArithmeticOper{
	
	public static void main(String[] args){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println(" Enter + for Addition / - for Subtraction/ * for multiplication/ / for division");
        String ch = scan.next();
        System.out.println("Enter the numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        

        switch(ch){

        case "+" : System.out.println("Addition = "+(num1+num2));
        break;
        case "-" : System.out.println("Subtraction = "+(num1-num2));
        break;
        case "*" : System.out.println("Multiplication = "+(num1*num2));
        break;
        case "/" : System.out.println("Division = "+(num1/num2));
        break;
        default: System.out.println("Enter valid operator");
        }
	}
}