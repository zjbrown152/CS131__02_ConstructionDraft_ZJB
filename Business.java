
public class Business extends Building
{
	protected int numRentableUnits;
	
	
	public Business()
	{
		super();
		this.numRentableUnits=0;
	}
	
	

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
		
	}
	
	




	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	

}
