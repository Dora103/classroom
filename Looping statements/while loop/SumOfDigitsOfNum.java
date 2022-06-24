//Accept a number and print sum of digits of any number

class SumOfDigitsOfNum{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number");

    int num = sc.nextInt();
    int count=0,result=0;

    while(num>0){

    	
    	result = result+(num%10);
    	num = num/10;
    	count++;
    }
    
    System.out.println("Number of Digits are"+result);



	}
}