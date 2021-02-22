
public class Mall extends Business
{
	private int RentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	public Mall() 
	{
		super();
		RentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
		
	}


	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		

	}
	
	public void draw()
	{
		
	}
	
	public String displayData()
	{
		StringBuilder m= new StringBuilder();


	public int getRentedUnits() {
		return RentedUnits;
	}


	public void setRentedUnits(int rentedUnits) {
		RentedUnits = rentedUnits;
	}


	public double getMedianUnitSize() {
		return medianUnitSize;
	}


	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}


	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}


	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	


	@Override
	public String toString() 
	{
		return "Mall [RentedUnits=" + RentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}
	
	

}
