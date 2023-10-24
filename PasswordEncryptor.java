//Taice Brenner
//Project 2B
import java.util.Scanner;

public class PasswordEncryptor {

	public static void main(String[] args) {
		

		String userPassword;
		
		Scanner getData = new Scanner(System.in);
		
		System.out.println("Enter a password that is 8-10 alpha characters (lowercase letters only for simplicity): ");
		userPassword = getData.nextLine();
		
		System.out.println("...encrypting the password...");
		
		String passwordOne = new String("Go" + userPassword);
		String passwordTwo = new String(passwordOne + "Rule");
		passwordTwo = passwordTwo.toLowerCase();
		passwordTwo = passwordTwo.replaceAll("a", "#").replaceAll("e", "@").replaceAll("i", "!").replaceAll("o", "1").replaceAll("u", "*");
		
		System.out.println("Your encrypted password is: " + passwordTwo);
		
		passwordTwo = passwordTwo.replaceAll("#", "a").replaceAll("@", "e").replaceAll("!", "i").replaceAll("1", "o").replaceAll("\\*", "u");
		passwordTwo = passwordTwo.substring(2, passwordTwo.length()-4);
		
		System.out.println("...decrypting the password...");
		
		System.out.println("Your decrypted password is: " + passwordTwo);
		
	}

}
