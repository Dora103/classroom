
public class GetShape {

	public Shape getShape(String shape)
	{
		if(shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shape.equalsIgnoreCase("TRIANGLE"))
			return new Triangle();
		
		return null;
	}
}
