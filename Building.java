/**********************************************************
 * Parent class for Business and Residential classes
 * 
 * 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********************************************************/
public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	
	public Building()
	{
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subgroup="";
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup) 
	{
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
		
		
		@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}

		public void draw()
		{
			
			
		}


public String displayData()
{
	StringBuilder b=new StringBuilder();
	b.append("Project Name: "+projectName+"\n");
	b.append("Address: "+completeAddress+"\n");
	b.append("Square Feet: "+totalSquareFeet+"\n");
	b.append("Occupancy Group: "+occupancyGroup+"\n");
	b.append("Occupancy Subgroup: "+subgroup+"\n");
	
	return b.toString();
	
	
}



public void setProjectName(String projectName) 
{
	this.projectName = projectName;
}

public String getCompleteAddress() 
{
	return completeAddress;
}

public void setCompleteAddress(String completeAddress) 
{
	this.completeAddress = completeAddress;
}

public double getTotalSquareFeet() 
{
	return totalSquareFeet;
}

public void setTotalSquareFeet(double totalSquareFeet) 
{
	this.totalSquareFeet = totalSquareFeet;
}

public String getOccupancyGroup() 
{
	return occupancyGroup;
}

public void setOccupancyGroup(String occupancyGroup) 
{
	this.occupancyGroup = occupancyGroup;
}

public String getSubgroup() 
{
	return subgroup;
}

public void setSubgroup(String subgroup) 
{
	this.subgroup = subgroup;
}

public String getProjectName() 
{
	return projectName;
}


}