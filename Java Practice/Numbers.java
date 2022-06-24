//Accept three numbers from user and find out largest number among three and also find out whether that three numbers are equal or not

class Numbers{
	public static void main(String[] args){

	java.util.Scanner scan = new java.util.Scanner(System.in);
    
    System.out.println("Enter three numbers");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    
    if((num1 == num2) && (num1==num3))
    {

   	 System.out.println("Numbers are equal");
    }

    else if(num1>num2)
    {
        if(num1>num3){
        System.out.println("Largest Numbers is = "+num1);
        }
    }
    else if(num2>num3)
    {
       System.out.println("Largest Number is = "+num2);
    }
    else
    {
        System.out.println("Largest Number is = "+num3);
    }
   
  }  
}

