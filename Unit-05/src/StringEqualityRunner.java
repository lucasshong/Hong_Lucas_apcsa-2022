//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String myWordOne = keyboard.nextLine();
		System.out.println("Enter anotherword :: ");
		String myWordTwo = keyboard.nextLine();
		System.out.println("Enter a word :: ");
		String myWordThree = keyboard.nextLine();
		System.out.println("Enter anotherword :: ");
		String myWordFour = keyboard.nextLine();
		
		StringEquality test = new StringEquality();
		test.setWords(myWordOne, myWordTwo);
		
		System.out.println(test);
		
		test.setWords(myWordThree, myWordFour);
		
		System.out.println(test);
	}
}