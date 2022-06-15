//Finf the smallest number among 4 numbers

import java.util.Scanner;
class SmallestNum{

    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 4 numbers");
      int[] nums = new int[4];
      int smalleNum = 0 ;
     
      for(int i=0;i<4;i++)
      {
         nums[i] = sc.nextInt();
      }
        smalleNum = nums[0];
       for(int i=0;i<4;i++)
      {
         if(nums[i] < smalleNum)
         {
           smalleNum = nums[i];
         }
      }

      System.out.println("Smallest Number is = "+smalleNum);
    }
	
}