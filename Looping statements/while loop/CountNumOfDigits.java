//Accept a numver and count number of digits entered by user.

class CountNumOfDigits{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number");

    int num = sc.nextInt();
    int count=0;

    while(num>0){

    	num = num/10;

    	count++;
    }
    
    System.out.println("Number of Digits are"+count);



	}
}