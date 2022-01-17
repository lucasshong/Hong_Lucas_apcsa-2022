//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Lucas
//Date - 1/17/22
//Class - AP CSA
//Lab  - Input

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextInt();
		
		System.out.print("Enter an double :: ");
		doubleTwo = keyboard.nextInt();
		
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextInt();
		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextInt();
		
		System.out.print("Enter a short :: ");
		shortOne = (short) keyboard.nextInt();
		
		System.out.print("Enter a short :: ");
		shortTwo = (short) keyboard.nextInt();


		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );

		//add in output for all variables


	}
}