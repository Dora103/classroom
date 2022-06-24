//WAP to accept cost price from user and ask whether the user is a student or not. Ifthe user is student and cost price is greater than 500, give discount of 10% else discount will be 5%. If user is not student and cost price is greaterf than 500 then give discount of 8% else discount will be 2%.

class CalDiscount{
	
	public static void main(String[] args){

	java.util.Scanner scan = new java.util.Scanner(System.in);

	System.out.println("Enter yes if you are student or enter no if not");
	String user = scan.nextLine();

	System.out.println("Enter the cost price");
	int costPrice = scan.nextInt();

    int i,j;
	double price;
	double totalPrice=0.0;

	if(user.equals("yes")){
       
       if(costPrice>500){
       price = costPrice/10;
  		totalPrice = costPrice-price;
       }
       else{
       price = costPrice/5;
  		totalPrice = costPrice-price;
       }
	}
	if(user.equals("no")){
	 		if(costPrice>500){
	       price = costPrice/8;
	  		totalPrice = costPrice-price;
	       }
	       else{
	       price = costPrice/2;
	  		totalPrice = costPrice-price;
	       }
	}

	 System.out.println("Total price = "+totalPrice);
	}

	}
