import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GenerateBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name for which bill will generate");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		
		System.out.println("Enter the number of units for which the bill will be calculated");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		//call getRate() method and calculateBill() method of selected plan
		
		p.getRate();
		p.calculateBill(units);
		
	}

}
