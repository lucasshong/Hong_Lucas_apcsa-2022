//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;

	private int denominator;

	public Rational()
	{
		numerator = 1;
		denominator = 1; 
	}
	public Rational(int num, int den)
	{ 
		numerator = num;
		denominator = den;
	}


	//write a setRational method
	
	public void setRational(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	public void setNumerator(int num) {
		numerator = num;
	}
	public void setDenominator(int denom) {
		denominator = denom;
	}

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		 setNumerator((getNumerator() * other.denominator) + (other.numerator * getDenominator()));
		 setDenominator(getDenominator() * other.denominator );
		    
		 reduce();
		    
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
	}

	private void reduce()
	{

		setNumerator(numerator / gcd(numerator, denominator));
	    setDenominator(denominator / gcd(numerator, denominator));

	}

	private int gcd(int numOne, int numTwo)
	{
		
		int gcd = 1;
	    for (int i = 1; i <= numOne && i <= numTwo; i++) {
	        if (numOne % i == 0 && numTwo % i == 0) {
	            gcd = i;
	        }
	    }
	    return gcd;
	    
	}

	public Object clone()
	{
		return new Rational(getNumerator(), getDenominator()); 
	}


	public int getNumerator() {
		
		return numerator;
		
	}
	
	public int getDenominator() {
		
		return denominator;
		
	}
	
	
	public boolean equals( Object obj)
	{
		return compareTo((Rational)obj) == 0;
	}

	public int compareTo(Rational other)
	{

		Rational num1 = new Rational(numerator, denominator);
	    Rational num2 = new Rational(other.getNumerator(), other.getDenominator());
	    num1.reduce();
	    num2.reduce();

	    if (num1.getDenominator() < num2.getDenominator()) {
		      return -1;
		    } else if (num1.getDenominator() == num2.getDenominator()) {
		      if (num1.getNumerator() < num2.getNumerator()) {
		        return -1;
		      } else if (num1.getNumerator() > num2.getNumerator()) {
		        return 1;
		      } else {
		        return 0;
		      }
		    } else {
		      return 1;
		    }
	}



	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	
}