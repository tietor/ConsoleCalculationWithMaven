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
    assertTrue(calculator.summe(10, 25) == 35);
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
}
