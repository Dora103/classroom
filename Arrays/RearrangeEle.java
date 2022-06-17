//Program to rearrange elements of array as positive element followed by negative element
import java.util.*;
class RearrangeEle{
	
	public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    System.out.println("Enter the size of array");
    int arrSize = scan.nextInt();
    int arr[] = new int[arrSize];
    int temp=0;


    System.out.println("Enter the elements in array");
    for(int i=0;i<arr.length;i++){
    arr[i] = scan.nextInt();
    }
     

    for(int i=0;i<arr.length;i++){
    	for(int j=i+1;j<arr.length;j++){

       if(arr[i]<arr[j])
       {  

          temp=arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

       }
   }
    }
    System.out.println("Array Elements are"+Arrays.toString(arr));
}}