//Program to calculated digits of number using class

class CalDigits{
	int count=0;
	int countDigits(int num){

		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;

	}


}
class Digits{
	
	public static void main(String[] args)
	{
		CalDigits calDigit = new CalDigits();

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num = sc.nextInt();
	 System.out.println(calDigit.countDigits(num));


	}
}