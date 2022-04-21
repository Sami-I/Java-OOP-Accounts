public class GoldAccount extends StandardAccount {
	
	public GoldAccount(String accType, double packageCost, double dayPhoneCost, double evePhoneCost, int numChannels, int broadband, double broadbandCost)
	{
		//call constructor of superclass
		super(accType, packageCost, dayPhoneCost, evePhoneCost, numChannels, broadband, broadbandCost);
	}
	//override method in superclass to print out that a spotify account is provided as well as music on demand
	public void printAccDetails(int dayMins, int eveMins,int broadbandUsage)
	{
		super.printAccDetails(dayMins, eveMins, broadbandUsage); //call method in superclass to print the details of the account first
		System.out.println("Spotify Account provided");
		System.out.println("Music On Demand provided");
		System.out.println();
	}
}
