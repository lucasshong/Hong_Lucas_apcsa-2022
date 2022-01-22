//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		Scanner keyboard = new Scanner(System.in);
		
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
		
	}

	public void calcDistance()
	{
		double xThree = (xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne);
		distance = Math.sqrt(xThree);
		
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		out.print("distance == ");
		out.printf("%.3f\n", distance);
	}
	
	//complete print or the toString

}