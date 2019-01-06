import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

  private Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void testSummeZweiPositiveIsOk() {
    assertEquals(35, calculator.summe(10, 25));
  }

  @Test
  public void testSummeZweiNegativeIsOK() {
    assertEquals(-20, calculator.summe(-15, -5));
  }

  @Test
  public void testSummeEinsNegativEinsPositiveIsOk() {
    assertEquals(-10, calculator.summe((-12), 2));
  }

  @Test
  public void testSummeAddiereNullmitZahlIsOk() {
    assertEquals(95, calculator.summe(0, 95));
  }

  @Test
  public void testSummeGrenzeVonMaxIntegerIsOk() {
    assertEquals(Integer.MAX_VALUE, calculator.summe(Integer.MAX_VALUE - 5, 5));
  }

  @Test(expected = java.lang.ArithmeticException.class)
  public void testSummeZweiPositiveWithOverflowThrowsException() {
    assertTrue(calculator.summe(Integer.MAX_VALUE, 5) != 0);
  }

  @Test(expected = java.lang.ArithmeticException.class)
  public void testSummeZweiNegativeWithOverflowThrowsException() {
    assertTrue(calculator.summe(Integer.MIN_VALUE, -70) != 0);
  }

  @Test
  public void testSummeErgebnisIsNullOk() {
    assertEquals(0, calculator.summe(-45, 45));
  }

  @Test
  public void testSubtractionZweiPositiveIsOk() {
    assertEquals(15, calculator.subtraktion(25, 10));
  }

  @Test
  public void testSubtractionEinsNegativeEinsPositiveIsOK() {
    assertEquals(15, calculator.subtraktion(10, -5));
  }

  @Test
  public void testSubtractionZweiNegativeIsOK() {
    assertEquals(-10, calculator.subtraktion(-20, -10));
  }

  @Test
  public void testSubtractionNullundPositiveZahlIsOk() {
    assertEquals(25, calculator.subtraktion(25, 0));
  }

  @Test(expected = ArithmeticException.class)
  public void testSubtractionEinsNegativEinsPositivOverflowHandlingThrowsException() {
    assertTrue(calculator.subtraktion(Integer.MIN_VALUE, 2) != 0);
  }

  @Test
  public void testSubtractionvonIntegerMinValueIsOk() {
    assertEquals(Integer.MIN_VALUE, calculator.subtraktion(Integer.MIN_VALUE + 5, 5));
  }

  @Test
  public void testSubtractionFirstNumberIsNullSecondNumberIsPositiveResultIsNegative() {
    assertEquals(-25, calculator.subtraktion(0, 25));
  }

  @Test
  public void testSubtractionFirstNumberIsPositiveSecondNumberIsNullResultIsLikeFirstNumber() {
    assertEquals(25, calculator.subtraktion(25, 0));
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZeroThrowsException() {
    assertTrue(calculator.division(10, 0) != 0);
  }

  @Test
  public void testDivisionZweiPositiveIsOk() {
    assertEquals(4, calculator.division(16, 4));
  }

  @Test
  public void testDivisionResultIsRounded() {
    assertTrue(calculator.division(10, 4) == 2);
  }

  @Test
  public void testDivisionResultIsNullIsOk() {
    assertEquals(0, calculator.division(0, 15));
  }

  @Test
  public void testDivisionOnePositiveOneNegativeIsOk() {
    assertEquals(-2, calculator.division(6, -3));
  }

  @Test
  public void testDivisionTwoNegativeIsOk() {
    assertEquals(5, calculator.division(-20, -4));
  }

  @Test
  public void testDivisionFirstNumberIsNegativeSecondNumberPositiveIsOk() {
    assertEquals(-3, calculator.division(-12, 4));
  }

  @Test
  public void testDivisionNegativeResultIsRounded() {
    assertEquals(-2, calculator.division(10, -4));
  }

  @Test(expected = ArithmeticException.class)
  public void testBinaryWithNegativeNumberOverflowHandlingThrowsException() {
    assertEquals("0", calculator.convertNumberToBinary(-2));
  }

  @Test
  public void testBinaryWithZeroIsOk() {
    assertEquals("0", calculator.convertNumberToBinary(0));
  }

  @Test
  public void testBinayWithPositiveNumberIsOK() {
    assertEquals("1010", calculator.convertNumberToBinary(10));
  }

  @Test
  public void testWurzelIsOK() {
    assertTrue(calculator.wurzel(64) == 8);
  }
}
