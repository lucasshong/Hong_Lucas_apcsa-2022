//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output= "";

		for (int h = 0; h < amount; h++) {
			
			char currentLetter = letter;
		
			for (int i = amount; i > h; i--) {
				
				for (int j = 0; j < i; j++) {
					
					output += currentLetter;
				}
				
				
				if (currentLetter == 'Z') {
					currentLetter = 'A';
				}
				
				else {
					currentLetter = (char)(currentLetter + 1);
				}
				
				output += " ";

			}
			output += "\n";
		}
		
		return output;
	}
}