//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore myToyStore = new ToyStore();
		 

		myToyStore.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball"); 
		System.out.println(myToyStore);
		System.out.println("max == " + myToyStore.getMostFrequentToy());
	}
}