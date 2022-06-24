//Accept number and Check if number is palindrom or not


class PalindromeNum{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number");

    int num = sc.nextInt();
    int rem,result=0,nsave;
    nsave=num;
    do{
    	rem = num%10;
    	result = (result *10)+rem;
        
        num = num/10;

    }
    while(num>0);
    
    if(nsave == result)
    System.out.println(" Number is Palindrome");
 	else
 	System.out.println(" Number is not Palindrome");


	}
}