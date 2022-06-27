//Program to print the area and perimeter of a triangle having sides of 4,5 and 6 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle_Cal {

	int a,b,c;

	Triangle_Cal(){
		a = 4;
		b = 5;
		c = 6;
	}

	void area_cal(){
       float area = (float)((float)1/2*(a*b));
       System.out.println("Area of Triangle : "+area);
	}

	void perimeter_cal(){
  		int perimeter = a+b+c;
   		System.out.println("Perimeter of Triangle : "+perimeter);
	}
}



class Triangle{
	public static void main(String[] args){
	Triangle_Cal tri = new Triangle_Cal();
	tri.area_cal();
	tri.perimeter_cal();
}
}