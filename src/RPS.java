import java.util.Random;
import java.util.Scanner;

public class RPS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num;
		String userChoice = "";
		String compChoice = "";
		
		System.out.println("Welcome To ROCK, PAPER, SCISSORS");
		System.out.print("Please Choose R)ock, P)aper or S)cissors. > ");
		
		userChoice = sc.nextLine();
		
		//Selecting Computer Choice
		num = rand.nextInt(3);
		if (num == 0)
			compChoice = "R";
		else if (num == 1)
			compChoice = "P";
		else if (num == 2)
			compChoice = "S";
		
		// Print the user choice
		if (userChoice.equals("S"))
			System.out.println("The user chose Scissors.");
		else if (userChoice.equals("R"))
			System.out.println("The user chose Rock.");
		else if (userChoice.equals("P"))
			System.out.println("The user chose Paper.");

		// Print the computer choice
		if (compChoice.equals("S"))
			System.out.println("The computer chose Scissors.");
		else if (compChoice.equals("R"))
			System.out.println("The computer chose Rock.");
		else if (compChoice.equals("P"))
			System.out.println("The computer chose Paper.");
		
		//Results
		//USER WINNNG
		if (userChoice.equals("R") && compChoice.equals("S"))
			System.out.println("You WON!.");
		else if (userChoice.equals("P") && compChoice.equals("R"))
			System.out.println("You WON!.");
		else if (userChoice.equals("S") && compChoice.equals("P"))
			System.out.println("You WON!.");

		//COMPUTER WINNNG
		if (userChoice.equals("S") && compChoice.equals("R"))
			System.out.println("Computer WON!.");
		else if (userChoice.equals("R") && compChoice.equals("P"))
			System.out.println("Computer WON!.");
		else if (userChoice.equals("P") && compChoice.equals("S"))
			System.out.println("Computer WON!.");

		//TIE
		if (userChoice.equals(compChoice))
			System.out.println("Its a TIE!.");
	}
}
