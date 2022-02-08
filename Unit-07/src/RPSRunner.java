//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]::");
			String player = keyboard.nextLine();
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			System.out.println(game);
			
			out.print("Hit enter to continue");
			String ans = keyboard.nextLine();
			
			
			while (ans == "") {
				
				out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]::");
				String player2 = keyboard.nextLine();
			
				RockPaperScissors game2 = new RockPaperScissors();
				game2.setPlayers(player2);
				System.out.println(game2);
				
				out.print("Hit enter to continue");
				ans = keyboard.nextLine();
			}
	}
}



