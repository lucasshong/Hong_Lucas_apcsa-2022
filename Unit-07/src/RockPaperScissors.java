//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int random = (int)Math.floor(Math.random() * 3);
		if (random == 0) {
			compChoice = "R";
		}
		if (random == 1) {
			compChoice = "P";
		}
		if (random == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if (compChoice.equals(playChoice)) {
			winner = "Draw Game";
		}
		else if ((compChoice.equals("R") && playChoice.equals("S")) || (compChoice.equals("P") && playChoice.equals("R")) || (compChoice.equals("S") && playChoice.equals("P"))) {
			winner = "Computer wins";
		}
		else {
			winner = "Player wins";
		}
		
		return winner;
	}

	public String toString()
	{
		String output = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n";
		String explain = "";
		if (determineWinner() == "Computer wins") {
			if (compChoice.equals("R")) {
				explain = "<<Rock Breaks Scissors>>";
			}
			if (compChoice.equals("P")) {
				explain = "<<Paper Covers Rock>>";
			}
			if (compChoice.equals("S")) {
				explain = "<<Scissors Cuts Paper>>";
			}
			output += "!" + determineWinner() + " " + explain + "!";
		}
		else if (determineWinner() == "Player wins") {
			if (playChoice.equals("R")) {
				explain = "<<Rock Breaks Scissors>>";
			}
			if (playChoice.equals("P")) {
				explain = "<<Paper Covers Rock>>";
			}
			if (playChoice.equals("S")) {
				explain = "<<Scissors Cuts Paper>>";
			}
			output += "!" + determineWinner() + " " + explain + "!";
		}
		else {
			output += "!" + determineWinner() + "!";
		}
		return output;
	}
}