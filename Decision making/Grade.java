import java.util.Scanner;
class Grade{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	 
      System.out.println("Enter the marks for paper1");
      double m1 = sc.nextInt();

      System.out.println("Enter the marks for paper2");
      double m2 = sc.nextInt();
      System.out.println("Enter the marks for paper3");
      double m3 = sc.nextInt();
      System.out.println("Enter the marks for paper4");
      double m4 = sc.nextInt();

      double total = m1+m2+m3+m4;

      double per = (total/400)*100;
      System.out.println(per);
      if(per >= 90){
      	 System.out.println("Grade A");
      }
      else if(per >= 80){
      	System.out.println("Grade B");
      }
     else if(per >= 70){
      	System.out.println("Grade C");
      }
      else if(per >= 60){
      	System.out.println("Grade D");
      }
      else if(per >= 40){
      	System.out.println("Grade E");
      }
      else{
      	System.out.println("Fail");
      }



	}
}