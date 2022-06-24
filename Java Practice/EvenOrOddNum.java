//Write a program to check whether a number is even or odd

class EvenOrOddNum{
	
	public static void main(String[] args){



	 java.util.Scanner scan = new java.util.Scanner(System.in);

	 System.out.println("Enter any number");
	 int num = scan.nextInt();

	 if(num%2 == 0){
	 System.out.println("Number is Even");
	 }

	 else{
	 System.out.println("Number is Odd");
	 }

	}
}