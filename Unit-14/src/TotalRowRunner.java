//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow myRows = new TotalRow();
		int[][] myList = {{1,2,3},{5,5,5,5}};
		int[][] myList2 = {{1,2,3},{5},{1},{2,2}};
		int[][] myList3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println(myRows.getRowTotals(myList));
		System.out.println(myRows.getRowTotals(myList2));
		System.out.println(myRows.getRowTotals(myList3));
	}
}



