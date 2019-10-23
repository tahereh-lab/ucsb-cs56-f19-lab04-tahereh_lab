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

  @Test public void testNoArgConstructor()
  {
    // default polynomial has degree 0, and value 0
    Polynomial p = new Polynomial();
    assertEquals(0,p.getDegree());
    assertEquals(0,(int) p.get(0));
  }

  /**
     test constructor that initializes from int array
     @see Polynomial#Polynomial(int [] coeffs)
   */

  @Test public void testConstructorIntArray()
  {
    Polynomial p = new Polynomial(new int[] {2,1,5});
    assertEquals(2, p.getDegree());
    assertEquals(2, (int) p.get(2));
    assertEquals(1, (int) p.get(1));
    assertEquals(5, (int) p.get(0));
  }

  /**
     test toString on {@code "0"}
     @see Polynomial#toString

   */

 
  @Test
  public void test_degreeOfPolynomialCoeffsLowToHigh_0c() {

    int [] coeffsLowToHigh = new int [] {0};
    assertEquals(0,Polynomial.degreeOfPolynomialCoeffsLowToHigh(coeffsLowToHigh));
  }

  /**
     test the degreeOfPolynomialCoeffsHighToLow function on {@code new int [] {0, 0, 0, -10, -11, 0};}
     @see Polynomial#degreeOfPolynomialCoeffsHighToLow
   */
  @Test
  public void test_degreeOfPolynomialCoeffsHighToLow_2() {

    int [] coeffsHighToLow = new int [] {0, 0, 0, -10, -11, 0};
    assertEquals(2,Polynomial.degreeOfPolynomialCoeffsHighToLow(coeffsHighToLow));
  }

  /**
     test the degreeOfPolynomialCoeffsHighToLow function on {@code new int [] {0, 0, 0, -10, 0};}
     @see Polynomial#degreeOfPolynomialCoeffsHighToLow
   */
  @Test
  public void test_degreeOfPolynomialCoeffsHighToLow_1() {

    int [] coeffsHighToLow = new int [] {0, 0, 0, -10, 0};
    assertEquals(1,Polynomial.degreeOfPolynomialCoeffsHighToLow(coeffsHighToLow));
  }

  /**
     test the degreeOfPolynomialCoeffsHighToLow function on {@code new int [] {0, 0, 0, 10};}
     @see Polynomial#degreeOfPolynomialCoeffsHighToLow
   */
  @Test
  public void test_degreeOfPolynomialCoeffsHighToLow_0a() {

    int [] coeffsHighToLow = new int [] {0, 0, 0, 10};
    assertEquals(0,Polynomial.degreeOfPolynomialCoeffsHighToLow(coeffsHighToLow));
  }

  /**
     test the degreeOfPolynomialCoeffsHighToLow function on all zeros
     @see Polynomial#degreeOfPolynomialCoeffsHighToLow
   */
  @Test
  public void test_degreeOfPolynomialCoeffsHighToLow_0b() {

    int [] coeffsHighToLow = new int [] {0, 0, 0};
    assertEquals(0,Polynomial.degreeOfPolynomialCoeffsHighToLow(coeffsHighToLow));
  }

  /**
     test the degreeOfPolynomialCoeffsHighToLow function on single zero
     @see Polynomial#degreeOfPolynomialCoeffsHighToLow
   */
  @Test
  public void test_degreeOfPolynomialCoeffsHighToLow_0c() {

    int [] coeffsHighToLow = new int [] {0};
    assertEquals(0,Polynomial.degreeOfPolynomialCoeffsHighToLow(coeffsHighToLow));
  }

  /**
     test the lowToHigh function that converts a highToLow int array of
     coefficients into a lowToHigh int array of coefficients on a single zero
     @see Polynomial#lowToHigh
   */

} // class PolynomialTest


