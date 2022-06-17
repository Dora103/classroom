//Program to reverse the array

class ReverseArr{
	
	public static void main(String args[]){
    
    int temp=0;

	java.util.Scanner scan = new java.util.Scanner(System.in);
	//int arr[] = new int[10];
	int arr[] = {1,2,3,4,5,6,7,8,9,11};

    int n=10;
	// for(int i=0;i<10;i++)
	// {
	//   arr[i] = scan.nextInt();
	// }
    
    for(int j=0;j<arr.length;j++)
	{
       if(arr[j]<arr[(arr.length-1)-j])
       {
	   temp = arr[j];
	   arr[j] = arr[(arr.length-1)-j];
	   arr[n-j] = temp;
	}
	}
     for(int i=0;i<arr.length;i++)
	{
	  System.out.print(arr[i]+" ");
	} 
	}
}