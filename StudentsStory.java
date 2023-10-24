//Taice Brenner
import java.util.Scanner;

public class StudentsStory {

	public static void main(String[] args) {
		
		String firstName;
		int yearsOfAge;
		String schoolMajor;
		double targetStartingSalary;
		
		Scanner getData = new Scanner(System.in);
		
		System.out.print("This program will tell the story of a student...\nEnter your name: ");
		firstName = getData.nextLine();
		
		System.out.print("Enter your age: ");
		yearsOfAge = getData.nextInt();
		
		System.out.print("Enter your major: ");
		schoolMajor = getData.next();
		
		System.out.print("Enter your target starting salary: ");
		targetStartingSalary = getData.nextDouble();
		
		System.out.println(firstName + " is a superstar student at age " + yearsOfAge + " who takes " + schoolMajor + " classes, hoping for a starting salary of $" + targetStartingSalary + " with each course she passes.\nSo good luck to " + firstName + ", chase your dreams, don't stop, just don't forget good ole Bentley, when you make it to the top!!\nGood luck " + firstName + "!!");
		
		getData.close();
		
	}

}