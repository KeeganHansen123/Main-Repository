package index;

import java.util.Scanner;
//I found this on stock overflow this is not mine
public class ManyTries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int attemptsNum = 0;
		    final int maxAttempts = 3;
		    int user;
			int comp;
			do {
		        System.out.print("Guess a number between 1 and 10: ");
		        Scanner input = new Scanner(System.in);
				user = input.nextInt();

		        if (user > comp)
		            System.out.println("My number is less than " + user + ".");
		        else if (user < comp)
		            System.out.println("My number is greater than " + user + ".");
		        else
		            System.out.println("Correct! " + comp + " was my number! ");
		    } while (user != comp && ++attemptsNum <maxAttempts );

		    if (attemptsNum == maxAttempts)
		        System.out.println("You loose. The number was: " + comp);

	}

}
