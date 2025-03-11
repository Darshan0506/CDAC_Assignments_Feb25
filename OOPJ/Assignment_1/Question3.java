public class Question3 {
  public static void main(String[] args) {
    double d = 100.2563;
    int a = (int) d;
    System.out.println("Initialized Double value: " + d);
    System.out.println("Explicitly typecasted value of Double into int: " + a);
    // in java when you convert the double values to integer all the digits after
    // decimal are ignored.
    /*
     * Fractional Part is Truncated:
     * The decimal (fractional) part of doubleValue (0.6789) is completely discarded
     * during conversion.
     * This is because the int type only holds whole numbers, and Java does not
     * round off, it simply removes the decimal part.
     * 
     * Precision Loss:
     * double can store up to 15-16 decimal digits of precision, whereas int can
     * only store whole numbers.
     * Any decimal value will be lost, which can lead to inaccuracies in
     * calculations.
     */

    // When we say double has 15-16 decimal digits of precision,
    // it means it can store up to 15-16 significant digits in total, not just after
    // the decimal point.

  }
}
