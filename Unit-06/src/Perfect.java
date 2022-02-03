//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		number = 0;
	}
	
	public Perfect(int n) {
		setNumber(n);
	}

	public void setNumber(int n) {
		number = n;
	}

	public boolean isPerfect()
	{
		int i = 1; //must be one
		int sum = 0;
		while (i < number) { //must be less than, not equal to
			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (number == sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		if (isPerfect()) {
			return (number + " is perfect");
		}
		else {
			return (number + " is not perfect");
		}
	}
	
}