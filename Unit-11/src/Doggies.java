//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		String name = "";
		int oldest = Integer.MIN_VALUE;
		for (Dog d : pups) {
			if (d.getAge() > oldest) {
				oldest = d.getAge();
				name =  d.getName();
			}
		}
		return name;
	}

	public String getNameOfYoungest()
	{
		String name = "";
		int youngest = Integer.MAX_VALUE;
		for (Dog d : pups) {
			if (d.getAge() < youngest) {
				youngest = d.getAge();
				name =  d.getName();
			}
		}
		return name;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}