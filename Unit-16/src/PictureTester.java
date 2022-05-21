/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture swan = new Picture("swan.jpg");
    swan.keepOnlyBlue();
    swan.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testCopy()
  {
    Picture swan = new Picture("swan.jpg");
    swan.copy(swan, 2, 2);
    swan.explore();
  }
  
  public static void testCreateCollage()
  {
    Picture swan = new Picture("swan.jpg");
    swan.createCollage();
    swan.explore();
  }
  
  public static void testNegate()
  {
    Picture swan = new Picture("swan.jpg");
    swan.negate();
    swan.explore();
  }
  
  public static void testGrayscale()
  {
    Picture swan = new Picture("swan.jpg");
    swan.grayscale();
    swan.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  public static void testmirrorVerticalRightToLeft()
  {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorVerticalRightToLeft();
    swan.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorHorizontal();
    swan.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorDiagonal();
    swan.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorGull();
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(3);
    swan.explore();
  }
  
  public static void testBackgroundSwap()
  {
    	Picture mark = new Picture("blue-mark.jpg");
    	Picture moon = new Picture("moon-surface.jpg");
    	mark.backgroundSwap(moon);  //replace blue pixels in mark with pixels in moon
					    //replace pixels containing the logo on the t-shirt
   	mark.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  System.out.println("Lucas Hong");
	  System.out.println("Period 1");
	  System.out.println("Computer 1");
	  System.out.println("5/17/22");
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	testBackgroundSwap();
  }
}