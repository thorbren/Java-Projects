//Taice Brenner
public class Initials {

	public static void main(String[] args) {
	
		String firstName = new String("Taice");
		String middleName = new String(" ");
		String lastName = new String("Brenner");
		
		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lastInitial = lastName.charAt(0);		
				
		System.out.println("Your initials are: " + firstInitial + middleInitial + lastInitial);
				
		
	}

}
