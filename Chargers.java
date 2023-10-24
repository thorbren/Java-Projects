//Taice Brenner
import java.util.Scanner;
public class Chargers {

	public static void main(String[] args) {

		
		int chargersOrdered;
		double costChargers = 10;
		double chargerDiscount;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the number of chargers ordered by the retail client: ");
		chargersOrdered = read.nextInt();

		double totalCost = chargersOrdered * costChargers; 
		System.out.print("Subtotal: $" + totalCost);
		
		if (chargersOrdered < 20)
			chargerDiscount = 0;
		else if (chargersOrdered < 30)
			chargerDiscount = 20;
		else if (chargersOrdered < 40)
			chargerDiscount = 30;
		else if (chargersOrdered < 50)
			chargerDiscount = 40;
		else
			chargerDiscount = 50;
		
		System.out.print("\nQualified Discount: " + chargerDiscount + "%");
		
		double discountApplied = totalCost - (totalCost * (chargerDiscount / 100)) ;
		
		System.out.print("\nSubtotal with Discount Applied: $" + discountApplied);
		
		double taxApplied = discountApplied + (discountApplied * 0.0625);
		
		System.out.print("\nOrder Total with Tax: $" + taxApplied);
		
		
	}

}
