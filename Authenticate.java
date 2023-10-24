//Taice Brenner
import java.util.Scanner;
public class Authenticate {

	public static void main(String[] args)
	{
		
		String managerUsername = "ssmith", managerPassword = "Falcons@2023", username, password;
		
		Scanner getData = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter Username: ");		
			username = getData.nextLine();
			
			System.out.print("Enter Password: ");
			password = getData.nextLine();
			
			if (managerUsername.equalsIgnoreCase(username) && managerPassword.equals(password))
			{
				System.out.println("Login Authenticated... Welcome!");
			}
			else
			{
				System.out.println("Invalid username or password...Access denied!");
			}
		
		} while (!managerUsername.equalsIgnoreCase(username) || !managerPassword.equals(password) );
		
}
}