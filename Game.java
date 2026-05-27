import java.util.*;
import java.util.Random;
public class Game 
{  
	
	public static void easy(Scanner s)
	{   
		boolean won=false;
		int secretnum10=(int)(Math.random()*10)+1;
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter your guess. Your limit is"+" "+(4-i));
			int num=s.nextInt();
			if(num==secretnum10)
			{
				System.out.println("CONGRATULATIONS!..You've nailed it!..That's the correct Number.");
				won=true;
				break;
			}
			else if(num>secretnum10)
			{
				System.out.println("Your guess is high!");
			}
			else
			{
				System.out.println("your guess is low!");
		    }
		}
		if(won==false)
		{
			System.out.println("GAME OVER!.");
			System.out.println("You have run ut of attempts..Better luck next time!.");
			System.out.println("The correct Number was"+" "+secretnum10);
		}
		s.nextLine();
	}
	public static void hard(Scanner s)
	{
		boolean win=false;
		int secretnum100=(int)(Math.random()*100)+1;
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter your guess. Your limit is"+" "+(6-i));
			int number=s.nextInt();
			if(number==secretnum100)
			{
				System.out.println("CONGRATULATIONS!..You've nailed it!..That's the correct Number.");
				win=true;
				break;
			}
			else if(number>secretnum100)
			{
				System.out.println("Your guess is high!");
			}
			else
			{
				System.out.println("your guess is low!");
		    }
		}
		if(win==false)
		{
		    System.out.println("GAME OVER!.");
		    System.out.println("You have run ut of attempts..Better luck next time!.");
			System.out.println("The correct Number was"+" "+secretnum100);

		}
		s.nextLine();
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String playAgain;
		do {
		System.out.println("Welcome to the NUMBER GUESSING GAME!");
		System.out.println();
		System.out.println("Are you ready to test your guessing skills...?");
		System.out.println("Once you select your range, a secret number will be generated. Your goal is to"
				+ " figure out that exact number. Let's see how many tires it takes you!");
		System.out.println();
		System.out.println("The PlayBook:");
		System.out.println();
		System.out.println("1. CHOOSE YOUR BATTLEGROUND.");
		System.out.println("Select your prefered difficulty range before starting the game.");
		System.out.println();
		System.out.println("EASY MODE:->"+" "+"Numbers from 1 to 10.");
		System.out.println("HARD MODE:->"+" "+"Numbers from 1 to 100.");
		System.out.println();
		System.out.println("2. KNOW YOUR LIMITS.");
		System.out.println("Your attempts are limited based on the range you choose.");
		System.out.println();
		System.out.println("-> Choosing 1 to 10 gives you 4 attempts to find the number");
		System.out.println("-> Choosing 1 to 100 gives you 10 attempts to find the number.");
		System.out.println();
		System.out.println("3. DECODE THE HINTS.");
		System.out.println("After every incorrect guess, the system will guide you by revealing whether your guess"
				+ " was High or Low compared to the secret number.");
		System.out.println();
		
		
	    
		
		System.out.println("Ready to play within the 1-100 range? yes/no...(if no, the game starts within the 1-10 range)");
		String userchoice=s.nextLine();
		
		if("yes".equals(userchoice)||"y".equals(userchoice))
			Game.hard(s);
		else
			Game.easy(s);
		
		System.out.println();
		System.out.println("do you want to play another round?");
		 playAgain=s.nextLine();
		}
		while(playAgain.equals("yes")||playAgain.equals("y"));	
		System.out.println("Thank you for playing!...");
	}
}
