//Program to find first and second largest number in array

class LargestNum{
	
	public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
    int arr[] = new int[5];
    int temp=0,k=0;

    System.out.println("Enter the elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = scan.nextInt();

    }

    temp = arr[0];
   
     for(int i=0;i<arr.length;i++)
    {
       if(arr[i]>temp)
       {
         temp = arr[i];
         k=i;
       }
       //System.out.println("Largest Number is = "+temp);
     }
     System.out.println("First Largest Number is = "+temp);
    
    temp = arr[0];
    for(int i=0;i<arr.length;i++)
    {
       if(arr[i]>temp && k!=i)
       {
         temp = arr[i];  
       }
       //System.out.println("Largest Number is = "+temp);
     }
     System.out.println("Second Largest Number is = "+temp);

    








	}
}