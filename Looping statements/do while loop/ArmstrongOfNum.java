//Accept number and check num is Armstrong or not


class ArmstrongOfNum{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number");

    int num = sc.nextInt();
    int result=0;

    do{

        result = result + (3 *(num%10));
        num = num/10;

    }
    while(num>0);
    
    System.out.println("Armstrong Number is "+result);



	}
}