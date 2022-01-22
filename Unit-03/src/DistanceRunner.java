//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter X1 :: ");
		int numberOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int numberTwo = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int numberThree = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int numberFour = keyboard.nextInt();
		
		Distance distanceCalc = new Distance();
		distanceCalc.setCoordinates(numberOne, numberTwo, numberThree, numberFour);
		distanceCalc.calcDistance();
		distanceCalc.print();
		
			
	}
}