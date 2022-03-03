//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String word = keyboard.next();
		
		TriangleWord test = new TriangleWord();
		test.printTriangle(word);
	}
}