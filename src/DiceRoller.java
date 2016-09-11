import java.util.Random;
import java.util.Scanner;

public class DiceRoller{
    
    public class PairofDice {
    
       private int die1;   
       private int die2;  
      
 
       public void PairofDice() {
      
           roll(); 
       }
       
       //Method to set generate random number 
       public void roll() {
       
           die1 = (int)(Math.random()*6) + 1;
           die2 = (int)(Math.random()*6) + 1;
       }
       
       // Return the number on the first die.
       public int getDie1() {  
          return die1;
       }
       
       // Return the number on the second die.
       public int getDie2() {
          return die2;
       }
   
    }  
	
    public static void main(String []args)
    {
    	
		int number = 0;
		String yes = "";
		int roll = 0;
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Ask the user if they want to roll the dice
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n):");
		yes = input.next();
			if (yes.equalsIgnoreCase("yes")){
		}
			
		//While loop to continue program if user agrees	
		while(yes.equalsIgnoreCase("y")){
				
		//Prompt the user to roll the dice
		System.out.println("Let's roll!");
		System.out.println();
		
		//Ask the user to enter the number of sides of a die
		System.out.println("Enter number of sides to a pair of dice:");
		number = input.nextInt();
			
		int die1 = (int) (number* Math.random() +1);
		int die2 = (int) (number*Math.random() +1);
        
		System.out.println("Die 1: "+ die1);
		System.out.println("Die 2: "+ die2);
	
        //Ask user it they want to play again
        System.out.println("Feelin' lucky? (Y/N)");
			yes = input.nextLine();		
			yes = input.nextLine();
        }

    }
    
}
