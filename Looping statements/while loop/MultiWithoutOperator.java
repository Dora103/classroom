class MultiWithoutOperator{
	
	public static void main(String[] args){

    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter two number");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int result=0;
    for(int i=1;i<=num2;i++){

      result =result+num1;
    }

    System.out.println("Multiplication result is = "+result);
}
}