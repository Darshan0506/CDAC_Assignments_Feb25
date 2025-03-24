//package OOPJ.Assignment_2.2Relational&LogicalOperators;

public class Question6 {
  public static void main(String[] args) {
    int a = -20;
    int b = -22;
    int c = -1;
    int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
    System.out.println("Largest of three numbers is: " + result);

  }
}
