//Program to print the area of two rectangles having sides(4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which return the area and breadth passed as parameter to its constructor.
class ReactangleArea{
	
	int length,width;

	ReactangleArea(int length1,int width1){

			length = length1;
			width = width1;

	}
	int Area()
	{
    	return (length*width);

	}
}

class Rectangle{
	
	public static void main(String[] args)
	{
		ReactangleArea ra = new ReactangleArea(4,5);
		System.out.println("Area1 : "+ra.Area());
		ReactangleArea ra1 = new ReactangleArea(5,8);
		System.out.println("Area2 : "+ra1.Area());

	}
}