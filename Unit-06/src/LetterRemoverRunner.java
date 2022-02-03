//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am   a", 'a');
		System.out.println(test);
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test);
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test);
		test.setRemover("abababababa ", 'b');
		System.out.println(test);
		test.setRemover("abababababa ", 'x');
		System.out.println(test);
											
	}
}