import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int die1;
		int die2;
		die1 = roll();
		die2 = roll();
		String choice;
		choice = getInput("Do you want to play?\nYes\nNo");
		choice = choice.toLowerCase();
		while(choice.equals("yes")) {

			choice = getInput("[0] Even\n[1] Odd");
			
			System.out.println("Die 1: "+die1+"\nDie 2: "+die2);

				if(didIWin(die1,die2,choice))
				{
					System.out.println("You win!");
				}else
				{
					System.out.println("You lose!");
				}
			}
			
			choice = getInput("Do you want to play?\nYes\nNo");
			choice = choice.toLowerCase();
			die1 = roll();
			die2 = roll();
		}
	}
	private static boolean didIWin(int die1, int die2, String choice)
	{
		
		return false;
	}
	
	
	private static int roll()
	{
		return roll(6,1);
	}
	private static int roll(int sides,int start) {
		Random roller = new Random();
		return roller.nextInt(sides)+start;
	}
	private static String getInput(String text) {
		Scanner input = new Scanner(System.in);
		String choice = "";
		try 
		{
			System.out.println(text);
			choice = input.nextLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return choice;
	}
	
	private static boolean isInputInteger(String input) {
		boolean isAnInteger = true;
		for(int c = 0; c < input.length();c++) {
			char letter = input.charAt(c);
			//'-' is 45 '0 - 9' 48 - 57
			if(c!=0 &&!(letter >= 48 && letter<= 57))
			{
				isAnInteger = false;
			}else if(letter != 45 && !(letter >= 48 && letter <= 57))
			{
				isAnInteger = false;
			}
		}
		return isAnInteger;
	}
}
