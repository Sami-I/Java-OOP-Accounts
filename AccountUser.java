import java.util.*;
public class AccountUser{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//integers to take as input from the user
		int dayMins;
		int eveMins;
		int broadbandUsage;
		//doubles to store the total overall cost of each account
		double bronzeTotal;
		double silverTotal;
		double goldTotal;
		//insantiate the three different account types
		BronzeAccount bronzeAcc = new BronzeAccount("Bronze",35,0.12,0.05,60,200,0.2);
		SilverAccount silverAcc = new SilverAccount("Silver",45,0.12,0,130,300,0.1);
		GoldAccount goldAcc = new GoldAccount("Gold",60,0,0,230,2000,0.1);
		do
		{
			System.out.print("Please enter the number of daytime minutes used per month: ");
			dayMins = input.nextInt();
		}while(dayMins < 0); //keep repeating each time a negative value is taken as input
		do
		{
			System.out.print("Please enter the number of nighttime minutes used per month: ");
			eveMins = input.nextInt();			
		}while(eveMins < 0); //keep repeating each time a negative value is taken as input
		do
		{
			System.out.print("Please enter the number of Gigabytes used per month: ");
			broadbandUsage = input.nextInt();
			
		}while(broadbandUsage < 0); //keep repeating each time a negative value is taken as input
		
		    //print the details of each account with the totals by calling the printAccDetails method
			bronzeAcc.printAccDetails(dayMins, eveMins, broadbandUsage);
			silverAcc.printAccDetails(dayMins, eveMins, broadbandUsage);
			goldAcc.printAccDetails(dayMins, eveMins, broadbandUsage);
			//get the total cost for each account by calling the getTotal method in the superclass 
			bronzeTotal = bronzeAcc.getTotal();
			silverTotal = silverAcc.getTotal();
			goldTotal = goldAcc.getTotal();
			//workout which account is the cheapest and print it			
			if(bronzeTotal < silverTotal && bronzeTotal < goldTotal)
			{
				System.out.println("Bronze account is cheapest cost");
			}
			else if ((silverTotal < bronzeTotal && silverTotal < goldTotal) || silverTotal == bronzeTotal && silverTotal != goldTotal)
			{
				System.out.println("Silver account is cheapest cost");
			}
			else if((goldTotal < bronzeTotal && goldTotal < silverTotal) || goldTotal == bronzeTotal || goldTotal == silverTotal )
			{
				System.out.println("Gold account is cheapest cost");
			}
		
    }

}
