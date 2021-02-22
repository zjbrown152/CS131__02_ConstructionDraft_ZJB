
public class Business extends Building
{
	protected int numRentableUnits;
	
	
	public Business()
	{
		super();
		numRentableUnits=0;
	}
	
	

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
	}
	
	public void draw()
	{
		
	}
	
	public String displayData()
	{
		super.displayData();
		StringBuilder c= new StringBuilder();
		c.append(")
		
	}



	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	

}
