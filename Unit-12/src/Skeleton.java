//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	String name;
	int howBig;

	public Skeleton() {
		name = " ";
		howBig = 0;
	}
	
	public Skeleton(String n, int size) {
		name = n;
		howBig = size;
	}

	public int getHowBig() {
		return howBig;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other) {
		if (howBig > other.getHowBig()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Monster other) {
		if (howBig < other.getHowBig()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean namesTheSame(Monster other) {

		if (name.equals(other.getName())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		
		return name + " " + howBig;
		
	}
}