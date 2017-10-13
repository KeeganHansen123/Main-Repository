package index;

import java.util.Scanner;
//I found this on stock overflow this is not mine
public class ManyTries {

	public static void main(String[] args) 
	{
		final String PASSWORD = "Test";
		
		Scanner input = new Scanner(System.in);
		int tries = 3;
		String password = "";
		while (tries -- > 0 && !PASSWORD.equals(password))
		{
			System.out.println("Enter your password: ");
			password = input.nextLine();
			if(password.equals(PASSWORD))
				System.out.println("Welcome");
			else
				System.out.println("Incorrect Attempts remaining: " + tries);
		}
			
				

	}

}
