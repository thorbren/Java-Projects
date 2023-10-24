//Taice Brenner
//Project 3
import  java.util.Scanner;
public class PetesPickups {

	public static void main(String[] args) {
	
		final double DOWN_PAYMENT = 5000.00;
		final int MONTHLY_FEE = 21000;
		char leasePlan;
		double milesDriven;
		double leaseTotal = DOWN_PAYMENT + MONTHLY_FEE;
		double totalCost;
		double mileageOver;
		double extramilesCost = 0.0;
		
		Scanner getData = new Scanner(System.in);
		
		System.out.print("\t******Welcome to Pete's Pickups******");
		System.out.print("\n\t***We lease pickup trucks at a low cost***");
		System.out.print("\nLet's predict the total cost of your pickup truck lease...");
		System.out.print("\nEnter the 5-year lease package(A, B, or C): ");
		leasePlan = getData.nextLine().charAt(0);
		
		System.out.print("\nEnter the total miles you drove the past 5 years (1,000-40,000): ");
		milesDriven = getData.nextDouble();
		

		if ( (leasePlan == 'A'  || leasePlan == 'B' || leasePlan == 'C' ) && (milesDriven >= 1000 && milesDriven <= 40000) ) 
		{	
			if (leasePlan == 'A') 
			{
				if (milesDriven > 25000)
				{ mileageOver = milesDriven - 25000;
				extramilesCost = mileageOver * 0.20;
				System.out.println("You exceeded the mileage for your lease package by " + mileageOver + " miles");
				}
			}
			else if (leasePlan == 'B') 
			{
				if (milesDriven > 30000)
				{
				mileageOver = milesDriven - 30000;
				extramilesCost = mileageOver * 0.25;
				System.out.println("You exceeded the mileage for your lease package by " + mileageOver + " miles.");
				}
			}
			else if (leasePlan == 'C')
			{	
				if (milesDriven > 35000)
				{
				mileageOver = milesDriven - 35000;
				extramilesCost = mileageOver * 0.30;
				System.out.println("You exceeded the mileage for your lease package by " + mileageOver + " miles.");
				}
			}
				totalCost = DOWN_PAYMENT + MONTHLY_FEE + extramilesCost;
				System.out.printf("\nThe total cost of your lease would be $5,000.00 down payment, plus $21,000.00 total monthly fees, plus $%,.2f for mileage overage, so your total paid for the lease is: $%,.2f.", extramilesCost, totalCost);
			
		}
		else
			{
				System.out.println("Sorry, you have entered invalid data - program terminated");
			}
		}
	}