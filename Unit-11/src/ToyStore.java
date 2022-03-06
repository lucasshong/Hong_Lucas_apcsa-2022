//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for (String name : toys.split(" ")) {
			
			Toy myToy = getThatToy(name);
			
			if(myToy == null)
			{
				toyList.add(new Toy(name));
			}
			else
			{
				myToy.setCount(myToy.getCount() + 1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if(toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int frequent = toyList.get(0).getCount();
  		String name = toyList.get(0).getName();
  		for(int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > frequent) {
  				frequent = toyList.get(i).getCount();
  				name = toyList.get(i).getName();
  			}
  		}
  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sorted = new ArrayList<Toy>();
  		int index = 0;
  		
  		for(int i = toyList.size(); i > 0; i--) {
  			sorted.add(new Toy(getMostFrequentToy()));
  			sorted.get(index).setCount(getThatToy(getMostFrequentToy()).getCount());
  			toyList.remove(getThatToy(getMostFrequentToy()));
  			index++;
  		}
  		
  		toyList = sorted;
  		
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}