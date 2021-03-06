package activity9;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten", "jack", "queen", "king"};
		String[] suits = {"hearts", "diamonds", "clubs", "spades"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println(d);
		System.out.println(d.size());
		System.out.println(d.deal());
		
		
		
	}
}
