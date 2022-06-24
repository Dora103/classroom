//Program to perform matrix addition and multiplication of theb 2D array.

public class MatrixAddAndMulti{

public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
    
    int arr[][] = new int[2][2];
    int arr1[][] = new int[2][2];
    int arr2[][] = new int[2][2];
    int arr3[][] = new int[2][2];
    int temp=0,temp1=0;


    System.out.println("Enter the elements in array");
    
    for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
    		arr[i][j] = scan.nextInt();
   		 }
    }

    System.out.println("Enter the elements in array");
    for(int i=0;i<arr1.length;i++){
       for(int j=0;j<arr1.length;j++){
         arr1[i][j] = scan.nextInt();
          }
    }
   for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
           temp = arr[i][j] * arr1[i][j];
           temp = temp+(arr[i][j] * arr1[i+1][j+1]);
          arr2[i][j] = temp;
          }
    }

    for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr.length;j++){
           temp1 = arr[i][j] * arr1[i][j];
           temp1 = temp1*(arr[i][j] * arr1[i+1][j+1]);
          arr3[i][j] = temp1;
          }
    }

    System.out.println("Addition of Matrix");
    for(int i=0;i<arr2.length;i++){
       for(int j=0;j<arr2.length;j++){
        System.out.print(arr2[i][j]);
       }
         System.out.println(""); 
   }

   System.out.println("Multiplication of Matrix");
    for(int i=0;i<arr3.length;i++){
       for(int j=0;j<arr3.length;j++){
        System.out.print(arr3[i][j]);
       }
         System.out.println(""); 
   }

}}