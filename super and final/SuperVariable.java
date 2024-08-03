//Program to use super at variable level
class Vehicle{
	int speed = 170;

}
class Car extends Vehicle{
	int speed = 130;
	void display(){
		System.out.println("Maximum Speed: " + super.speed);
	}
}
class SuperVariable{
	public static void main(String[] args) {
		Car s = new Car();
		s.display();
	}
}