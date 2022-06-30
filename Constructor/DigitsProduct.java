//Program to find product of all digits of number using class

class CalDigitsProduct{
	int product=1;
	int multiplyDigits(int num){

		while(num>0)
		{
			product = product * (num%10);
			num = num/10;
		}
		return product;

	}


}
class DigitsProduct{
	
	public static void main(String[] args)
	{
		CalDigitsProduct calDigit = new CalDigitsProduct();

	 java.util.Scanner sc = new java.util.Scanner(System.in);
	 System.out.println("Enter the number");
	 int num = sc.nextInt();
	 System.out.println(calDigit.multiplyDigits(num));


	}
}