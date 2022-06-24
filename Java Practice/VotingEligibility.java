//WAP to check whether person is eligible for voting or not

class VotingEligibility{
	
	public static void main(String[] args){

	java.util.Scanner scan = new java.util.Scanner(System.in);

	System.out.println("Enter the age of person");
    int age = scan.nextInt();

	if(age>18){
	System.out.println("Eligible for voting");
	}
	else
	System.out.println("Not Eligible for voting");
	}

}