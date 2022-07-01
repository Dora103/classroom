//Program to find factorial, palindrome, armstrong using function and give options for selection of the same in switch case.

class PerformOperations{

	void factorial(int num){
		int fact=1;
		if(num == 0)
		{
			System.out.println("Factorial of Number is = 1");
			
		}
		else {
			while(num>0){

					fact = fact * num;
					num--;
				}
				System.out.println("Factorial of Number is = "+fact);
			}
		
		
	}

	void palindrome(int num){

		int rem =0 , nsave =num;
		do{
			rem = (rem*10)+(num%10);
			num = num/10;
		}while(num>0);

		if(rem == nsave)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
		System.out.println("Number is not palindrome");
		}
	}

	void armstrong(int num){
		int result=0;

    do{

        result = result + (3 *(num%10));
        num = num/10;

    }
    while(num>0);
    
    System.out.println("Armstrong Number is "+result);
	}	

}
class MainOperation{
	
	public static void main(String[] args)
	{
		PerformOperations op = new PerformOperations();

	 java.util.Scanner sc = new java.util.Scanner(System.in);
	 System.out.println("Enter the number");
	 int num = sc.nextInt();
	 System.out.println("Enter the option from below: ");
	 System.out.println("1 for Factorial of Number");
	 System.out.println("2 for Palindrome of Number");
	 System.out.println("3 for Armstrong of Number");
	 int option = sc.nextInt();

	 switch(option)
	 {
	 	case 1: op.factorial(num);
	 	break;

	 	case 2: op.palindrome(num);
	 	break;

	 	case 3: op.armstrong(num);
	 	break;

	 	default: System.out.println("Enter the valid option");
	 }
}
}