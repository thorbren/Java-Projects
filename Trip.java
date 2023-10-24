// Taice Brenner
public class Trip {

	public static void main(String[] args) {
	
		int totalMiles = 1365;
		int averageSpeed = 65;
		double drivingHoursPerDay = 14;
		double totalDays = ((totalMiles) / (averageSpeed * drivingHoursPerDay));

		
		System.out.print("Road Trip to Tampa, FL!!\nIt is " + totalMiles + " miles!!\nTo avoid getting a speeding ticket, the students will drive " + averageSpeed + " miles/hour.\nTo avoid falling asleep, the students will drive " + drivingHoursPerDay + " hours, then rest till the next day.\nThe trip will take approximately " + totalDays + " days."); 
		
	}

}
