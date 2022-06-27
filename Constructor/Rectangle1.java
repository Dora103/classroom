//Program to print the area of rectangle by creating a class named 'Area' taking the values of its length and breadth as parameter of its contructor and having a method named 'returnArea' which return the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

class ReactangleArea1{
	
	int length,width;

	ReactangleArea1(int length1,int width1){

			length = length1;
			width = width1;

	}
	int returnArea()
	{
    	return (length*width);

	}
}

class Rectangle1{
	
	public static void main(String[] args)
	{

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		ReactangleArea1 ra = new ReactangleArea1(length,breadth);

		System.out.println("Area Of Rectangle : "+ra.returnArea());
		

	}
}