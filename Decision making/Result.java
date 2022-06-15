//Accept 3 paper  marks, if paper mark less than 45 show "fail" or show "pass"
import java.util.Scanner;
class Result{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int[] marks = new int[3];
      String result = "pass";
	  for(int i=0;i<3;i++)
	  {
	    marks[i] = sc.nextInt();
	  }

	  for(int i=0;i<3;i++)
	  {
	    if(marks[i]<45){
             result="fail";
	    }
	  }
    System.out.println("Result is = "+result);
	}
}