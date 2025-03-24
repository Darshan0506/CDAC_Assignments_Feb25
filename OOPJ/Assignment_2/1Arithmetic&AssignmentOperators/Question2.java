public class Question2 {
  public static void main(String[] args) {
    int n = 12;
    if (isOdd(n)) {
      System.out.println("Number is odd.");
    } else {
      System.out.println("Number is even");
    }
  }

  public static boolean isOdd(int n) {
    return (n & 1) == 1;
  }
}
