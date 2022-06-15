import java.util.Scanner;
class CharCheck{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	 
      System.out.println("Enter the Character");
      char ch = sc.next().charAt(0);


      if(ch >= 65 && ch <= 90){
      	 System.out.println("UpperCase");
      }
      else if(ch >= 97 && ch <= 122){
      	System.out.println("LowerCase");
      }
     else if(ch >= 48  && ch <= 57){
      	System.out.println("Number");
      }
      else if(ch >=  32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126){
      	System.out.println("Special Character");
      }
      


	}
}