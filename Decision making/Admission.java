//Accept 3 papers marks, find total and percentage, if percentage>= 62 and gender is female, she can take admission else can't take addmission.

import java.util.Scanner;

class Admission{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter marks of paper1");
	  int paper1 = sc.nextInt();
	  System.out.println("Enter marks of paper2");
	  int paper2 = sc.nextInt();
	  System.out.println("Enter marks of paper3");
	  int paper3 = sc.nextInt();

	  double total=0;
	  double per=0;
	  String gender = "Female";

	  total = (double)(paper1+paper2+paper3);

	  per = (total/300)*100;
      System.out.println(per);
	  if(per >= 62f){
	  	if(gender == "Female")
	  	{
         System.out.println("Student is eligible for Admission");
	  	}
	  }
	  else{
	  System.out.println("Student can't take admission");
	  }
}
}