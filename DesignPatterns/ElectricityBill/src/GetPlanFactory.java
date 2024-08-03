
public class GetPlanFactory {

	//use getPlan method to get object of Plan
	
	public Plan getPlan(String planType)
	{
		if(planType == null)
		{
			return null;
		}
		
		if(planType.equalsIgnoreCase("DOMESTIC PLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIAL PLAN")) {
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("INDUSTRIAL PLAN")) {
			return new IndustrialPlan();
		}
		return null;
	}
}
