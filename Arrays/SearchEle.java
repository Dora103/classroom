//Program to search element in array

class SearchEle{
	
	public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    System.out.println("Enter the size of array");
    int arrSize = scan.nextInt();
    int arr[] = new int[arrSize];

    System.out.println("Enter the elements in array");
    for(int i=0;i<arr.length;i++){
    arr[i] = scan.nextInt();
    }

    System.out.println("Enter the element to search in array");
    int searchElement = scan.nextInt();

    for(int i=0;i<arr.length;i++){
       if(arr[i] == searchElement){
       	System.out.println("Element Found");
       	break;
       }
    }
	System.out.println("Element not Found");










	}
	}