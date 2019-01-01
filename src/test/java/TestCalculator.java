import static org.junit.Assert.*;

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
    calculator = new Calculator();
    assertTrue(calculator.summe(10, 25) == 35);
  }

  @Test
  public void testSubtractionZweiPositiveIsOk() {
    calculator = new Calculator();
    assertTrue(calculator.subtraktion(25, 10) == 15);
  }
}
