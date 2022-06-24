//WAP using following menus- choice1: Accept number and find out square and cube. choice2: check whether the given year is LEAP or not. If user enters wrong choice appropriate message should get displayed.

class SquareAndLeap{
	
	public static void main(String[] args){
     
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("choice1: To find out square and cube  / choice2: To find LEAP or not");
    System.out.println("Enter 1 for choice1 and 2 for choice2");
    int option = scan.nextInt();

    System.out.println("Enter number / year as per option selected");
    int num = scan.nextInt();
    int result1,result2,result3;
    switch(option)
    {
		case 1: System.out.println("Square of number = "+(num * num)+" Cube of number = "+(num*num*num));
		break;

		case 2: if(num%4 == 0 )
		        {
		        	System.out.println("true");
		          if(num%100 == 0)
		          {
		            if(num%400 == 0){
		            System.out.println("It is definetly a LEAP year");
		            }
		            else{
		            System.out.println("It is not a LEAP year");
		            }
		          }
		      
		          else{
		          System.out.println("It is a LEAP year");
		          }
		        }
		break;
		default: System.out.println("Enter valid option");
    }

    




	}
}