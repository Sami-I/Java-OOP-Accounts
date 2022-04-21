public class SilverAccount extends StandardAccount {
	
	public SilverAccount(String accType, double packageCost, double dayPhoneCost, double evePhoneCost, int numChannels, int broadband, double broadbandCost)
	{
		//call constructor of superclass
		super(accType, packageCost, dayPhoneCost, evePhoneCost, numChannels, broadband, broadbandCost);
	}
	//override method in superclass to also print out that a spotify account is provided
	public void printAccDetails(int dayMins, int eveMins,int broadbandUsage)
	{
		System.out.println();
		super.printAccDetails(dayMins, eveMins, broadbandUsage); //call method in superclass to print the details of the account first
		System.out.println("Spotify Account provided");
		System.out.println();
	}
}