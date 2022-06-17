//Program to find sum of each row of 2D array
import java.util.*;
public class SumOfEachRow{

public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    
    int arr[][] = new int[2][2];
    int arr1[] = new int[2];
    int temp=0;


    System.out.println("Enter the elements in array");
    
    for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
    		arr[i][j] = scan.nextInt();
   		 }
    }

    for(int i=0;i<arr.length;i++){
    	for(int j=0;j<arr.length;j++){
          
          temp += arr[i][j];

    	}
      arr1[i] = temp;
      temp=0;
    }

System.out.println("Sum of Each row is"+Arrays.toString(arr1));

   }
   }