//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String one = keyboard.nextLine();
		System.out.println("Enter another word :: ");
		String two = keyboard.nextLine();
		
		WordsCompare test = new WordsCompare();
		test.setWords(one, two);
		System.out.println(test);
	}
}