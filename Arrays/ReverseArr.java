//Program to reverse the array
import java.util.*;
class ReverseArr{
	
	public static void main(String args[]){
    
    int temp=0;

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    System.out.println("Enter the size of array");
    int arrSize = scan.nextInt();
    int arr[] = new int[arrSize];

    System.out.println("Enter the elements in array");
    for(int i=0;i<arr.length;i++){
    arr[i] = scan.nextInt();
    }

    int j=1,k=arr.length-1;
    for(int i=0;i<arr.length;i++){

      
    	if(i<j){
    		temp=arr[i];
          arr[i] = arr[k];
          arr[k] = temp;
    	}
    	k--;
    }
    System.out.println("Array Elements are"+Arrays.toString(arr));
    





   
	}
}