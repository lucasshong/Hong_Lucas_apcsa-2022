//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 1;
		for (int i = 1; i <= a && i <= b && i <= c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				gcf = i;
			}
		}

		return gcf;
	}

	public String toString()
	{
		String output="";
		boolean pythag=false;
		boolean evenodd=false;
		boolean gcf=false;
		
		
		for (int i = 1; i < number; i++) {
			int a = i;
			for (int j = i; j < number; j++) {
				int b = j;
				for (int k = j; k < number; k++) {
					int c = k;
					
					pythag=(Math.pow(a,2)+ Math.pow(b,2) == Math.pow(c, 2));
					evenodd=((a % 2 != 0 && b % 2 == 0 && c % 2 != 0) || (b % 2 != 0 && a % 2 == 0 && c % 2 != 0));
					gcf=(greatestCommonFactor(a,b,c) <= 1);
					if (pythag && evenodd && gcf) {
						output += a + " " + b + " " + c + "\n";
					}
				}	
			}
		}
		
		return output+"\n";
	}
}