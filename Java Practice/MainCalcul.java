class FactorialCal{
	int result =1;
	void calFactorial(){
	for(int i=num;i<=1;i--){
        result = result*i;
       }
     }
     System.out.println("Factorial of Number is = "+result);
}

class MainCalcul{
	
	public static void main(String[] args){
	FactorialCal fc = new FactorialCal();


	java.util.Scanner scan = new java.util.Scanner(System.in);

	 System.out.println("Enter any number");
	 int num = scan.nextInt();

	 fc.calFactorial(num); 
	}
}