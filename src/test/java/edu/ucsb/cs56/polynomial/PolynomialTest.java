package edu.ucsb.cs56.polynomial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * The test class PolynomialTest, to test the Polynomial class
 *
 * @author Phill Conrad
 * @version CS56, 14W, lab03
 * @see Polynomial
 */

public class PolynomialTest
{
  // Instead of using an @Before to set up the polynomials, I've hard coded
  // the polynomials directly in each test.  I started settting it up
  // with an @Before routine, but I found that it was tedious to have
  // to keep referring back to the top of the file to see what the
  // values of each polynomial were.  This way, you can see the entire
  // test all on the screen at the same time.

  /**
     test no arg constructor from Polynomial
     @see Polynomial#Polynomial()

   */

 

  
 
  

  
  @Test
  public void test_degreeOfPolynomialCoeffsLowToHigh_2() {

    int [] coeffsLowToHigh = new int [] {0, -11, -12, 0, 0, 0};
    assertEquals(2,Polynomial.degreeOfPolynomialCoeffsLowToHigh(coeffsLowToHigh));
  }
}

  
