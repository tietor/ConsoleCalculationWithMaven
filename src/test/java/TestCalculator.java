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
    assertTrue(calculator.subtraktion(25, 10) == 15);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZeroThrowsException() {
    calculator.division(10, 0);
  }

  @Test
  public void testDivisionZweiPositiveIsOk() throws ArithmeticException {
    assertTrue(calculator.division(16, 4) == 4);
  }

  @Test
  public void testWurzelIsOK() {
    assertTrue(calculator.wurzel(64) == 8);
  }
}
