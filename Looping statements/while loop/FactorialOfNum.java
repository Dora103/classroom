//Accept any number and find factorial of number


class FactorialOfNum{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number");

    int num = sc.nextInt();
    int result=1;

    while(num>0){

    	
    	result = result*num;
    	num--;
    }
    
    System.out.println("Number of Digits are"+result);



	}
}