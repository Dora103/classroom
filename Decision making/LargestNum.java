//Find the largest number among 5 numbers
import java.util.Scanner;
class LargestNum{

    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 numbers");
      int[] nums = new int[5];
      int largeNum = 0 ;
     
      for(int i=0;i<5;i++)
      {
         nums[i] = sc.nextInt();
      }
        largeNum=nums[0];
       for(int i=0;i<5;i++)
      {
         if(nums[i] > largeNum)
         {
           largeNum = nums[i];
         }
      }

      System.out.println("Largest Number is = "+largeNum);
    }
	
}