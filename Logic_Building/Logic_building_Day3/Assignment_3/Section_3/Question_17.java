public class Question_17 {
  public static void main(String[] args) {
    int n = 6;
    for (int row = n; row >= 1; row--) {

      for (int s = n - row; s >= 1; s--) {
        System.out.print(" ");
      }
      for (int col = row; col >= 1; col--) {
        System.out.print("* ");
      }
      System.out.println();

    }
  }
}
