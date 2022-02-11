//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int d = 0; 
		boolean start = false;
		int no = -1;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 != 0 && start == false) {
				start = true;
			}
			else if (ray[i] % 2 == 0 && start == true) {
				d++;
				return d;
			}
			else if (ray[i] % 2 != 0 && start == true) {
				d++;
			}
		}
		return no;
	}
}