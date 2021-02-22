
public class SingleFamilyHome extends Residential
{
	private boolean garage;
	

	
	public SingleFamilyHome()
	{
		boolean garage=false;
		String projectname=("");
		String completeAdress=("");
		double totalSquareFeet=0;
		String occupancyGroup=("");
		String subgroup=("");
		super();
		
		
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		setGarage(true);
		setProjectName
		
		
	}
	
	public void setGarage(boolean g)
	{
		garage=g;
	}
	public boolean getGarage()
	{
		return garage;
	}
	public void setProjectName(String pn)
	{
		projectname=pn;
	}
	
		
	}
}
