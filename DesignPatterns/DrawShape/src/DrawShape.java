import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawShape {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetShape  gs = new GetShape ();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the shape you want to draw");
		
		String shape = br.readLine();
		
		Shape s = gs.getShape(shape);
		
		s.draw();

	}

}
