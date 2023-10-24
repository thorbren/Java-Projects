//Taice Brenner
import java.util.Scanner;
public class GrossPay {

	public static void main(String[] args) {
		
	double hourlyRate;
	double totalHours;
	int hour = 1;
	double totalPay = 0;
	
	Scanner getData = new Scanner(System.in);
	
	 System.out.print("Enter the hourly pay rate of the employee: ");
     hourlyRate = getData.nextDouble();
     
     System.out.println("Enter the number of hours the employee worked today: ");
     totalHours = getData.nextDouble();
	
     System.out.println("Here is a table of the gross pay earned per hour for this employee:");
     System.out.println("Hour\tGross Pay Earned");
     
     
     while (hour <= totalHours) {
    	 totalPay += hourlyRate;
    	 System.out.printf("%d\t%.2f\n", hour, totalPay);
    	 hour++;
    	 
     } 
     }	
}