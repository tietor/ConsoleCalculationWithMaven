public class Calculator {

  public int summe(int summand1, int summand2) throws java.lang.ArithmeticException {
    long value = (long) summand1 + (long) summand2;
    if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
      throw new java.lang.ArithmeticException();
    }
    return summand1 + summand2;
  }

  public int subtraktion(int value1, int value2) {
    return value1 - value2;
  }

  public int division(int value1, int value2) {
    return value1 / value2;
  }

  // Um diese Methode zu testen, habe ich eine Testklasse im gleichen package erstellt die CalculatorVIsibilityTest heisst
  protected int multiplikation(int value1, int value2) {
    return value1 * value2;
  }

  // Diese Methode kann man nur mit Reflection getetstet werden.
  // Denn die Methode ist private und man kann sie nur innerhalb der Klasse verwendet werden.
  // Deshalb kann man keinen JUnit-Test schreiben, da man keinen Zugriff auf die Methode hat.
  private int hochZwei(int value1) {
    return value1 * value1;
  }

  // Diese Methode kann man normal testen, da es keinen Access Modifier gibt und man somit auf die Mehtode zugreifen kann.
  double wurzel(double value1) {
    return Math.sqrt(value1);
  }
}
