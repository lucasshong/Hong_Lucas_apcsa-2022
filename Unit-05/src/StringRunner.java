//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
	Scanner keyboard = new Scanner(in);

	out.print("Enter the word :: ");
	String s = keyboard.next();
	
	StringOddOrEven test = new StringOddOrEven(s);
	
	System.out.print(test);
	}
}