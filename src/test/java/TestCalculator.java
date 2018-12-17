import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
  Calculator calculator;

  @Test
  public void testSummeZweiPositiveIsOk() {
    calculator = new Calculator();
    assertTrue(calculator.summe(10, 25) == 35);
  }
}
