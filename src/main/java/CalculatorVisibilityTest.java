import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CalculatorVisibilityTest {

  @Test
  public void testZweiPositiveMultiplikationIsOk() {
    Calculator calculator = new Calculator();
    assertTrue(calculator.multiplikation(2, 3) == 6);
  }
}
