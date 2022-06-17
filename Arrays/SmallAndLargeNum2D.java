//Program to find smallest and largest number in 2D array

public class SmallAndLargeNum2D{

public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    
    int arr[][] = new int[2][2];
    int large,small;
   


    System.out.println("Enter the elements in array");
    
    for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
    		arr[i][j] = scan.nextInt();
   		 }
    }

    large=arr[0][0];
   small=arr[0][0];
   
	for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
    		if(arr[i][j]>large)
    		{
    		   large=arr[i][j];
    		}
    		if(arr[i][j]<small){
    		 small=arr[i][j];
    		}
   		 }
    }

    System.out.println("Smallest = "+small + "Largest = "+large);
    }
    }

