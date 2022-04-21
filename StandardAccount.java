import java.util.*;
import java.lang.*;
public abstract class StandardAccount {
	protected String accType;
	protected double packageCost;
	protected double dayPhoneCost;
	protected double evePhoneCost;
	protected int numChannels;
	protected int broadband;
	protected double broadbandCost;
	public double total = 0; //the total cost for an account
	
	//constructor method
	public StandardAccount(String accType, double packageCost, double dayPhoneCost, double evePhoneCost, int numChannels, int broadband, double broadbandCost)
	{
		this.accType = accType;
		this.packageCost = packageCost;
		this.dayPhoneCost = dayPhoneCost;
		this.evePhoneCost = evePhoneCost;
		this.numChannels = numChannels;
		this.broadband = broadband;
		this.broadbandCost = broadbandCost;
	}
	//getters for each attribute that makes up an account
	public String getAccType()
	{
		return accType;
	}
	public double getPackageCost()
	{		
		total += packageCost;
		return packageCost;
	}
	public double getDayPhoneCost()
	{
		return dayPhoneCost;
	}
	public double getEvePhoneCost()
	{
		return evePhoneCost;
	}
	public int getNumChannels()
	{
		return numChannels;
	}
	public int getBroadband()
	{
		return broadband;
	}
	public double getBroadbandCost()
	{
		return broadbandCost;
	}
	public double getTotal()
	{
		return total;
	}
	//functions to calculate the costs 
	public double totalDayPhoneCost(double dayPhoneCost, int dayMins)
	{
		total += dayPhoneCost * dayMins;
		return dayPhoneCost * dayMins;
	}
	public double totalEvePhoneCost(double evePhoneCost, int eveMins)
	{
		total += evePhoneCost * eveMins;
		return evePhoneCost * eveMins;
	}
	public double totalBroadbandCost(int broadband, double broadbandCost, int broadbandUsage)
	{
		if(broadbandUsage - broadband > 0)
		{
			total += (broadbandUsage - broadband) * broadbandCost;
			return (broadbandUsage - broadband) * broadbandCost;
		}
		else
		{
		  return 0;
		}
		
	}
	public double round(double num) //function that rounds up to 2 decimal place
	{
		num = Math.round(num*100.0)/100.0;
		return num;
	}
	//method to print the all the details and costs of an account
	public void printAccDetails(int dayMins, int eveMins,int broadbandUsage)
	{
		System.out.println("Account summary for " + getAccType() + " account");
		System.out.println("Package cost: " + getPackageCost());
		System.out.println("Cost of daytime calls: " + getDayPhoneCost() + "/min");
		System.out.println("Cost of evening and weekend calls: " + getEvePhoneCost() + "/min");
		System.out.println("Number of Channels: " + getNumChannels());
		System.out.println("Broadband Included: " + getBroadband() + "GB");
		System.out.println("Broadband Cost (above included limit): " + getBroadbandCost() + "/GB");
		System.out.println("Total daytime calls cost: " + round(totalDayPhoneCost(getDayPhoneCost(), dayMins)));
		System.out.println("Total evening calls cost: " + round(totalEvePhoneCost(getEvePhoneCost(), eveMins)));
		System.out.println("Total (extra) broadband cost: " + round(totalBroadbandCost(getBroadband(), getBroadbandCost(), broadbandUsage)));
		System.out.println("Total cost: " + total);
	}
	
	
}
