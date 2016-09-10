import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
	
		
		int number = 0;
		String yes ="";
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Ask the user if they want to roll the dice
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n)");
		yes = input.next();
			if (yes.equalsIgnoreCase("yes")){
		}
		//Ask the user to enter the number
		System.out.println("Enter number of sides to a pair of dice:");
		number = input.nextInt();
		
		//Prompt the user to roll the dice
		System.out.println("Let's roll the dice:");
	
		
		//Display the result of teach of them
		//Ask them if she wants to roll the dice again

	}
}
