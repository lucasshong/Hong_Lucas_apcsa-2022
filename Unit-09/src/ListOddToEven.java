//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int start = -1;
		int end = 0;
		
		for (int i = 0; i < ray.size()-1; i++) {
			if (ray.get(i) % 2 != 0) {
				start = i;
				break;
			}
		}
		for (int i = ray.size()-1; i > start; i--) {
			if (ray.get(i) % 2 == 0) {
				end = i;
				break;
			}
		}
		if (start == -1 || end == 0) {
			return -1;
		}
		return end - start;
		
	}
}