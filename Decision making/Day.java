//Accept day and check day is weekend day or working day.

import java.util.Scanner;

class Day{
	public static void main(String []args){


  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number to Select the Day from List");
  System.out.println("1 Monday");
  System.out.println("2 Tuesday");
System.out.println("3 Wednesday");
System.out.println("4 Thursday");
System.out.println("5 Friday");
System.out.println("6 Saturday");
System.out.println("7 Sunday");

int day =0;

day = sc.nextInt();
if(day>5){
	System.out.println("Hurray Weekend");
}
else{
	System.out.println("Working Day");
}
}
}