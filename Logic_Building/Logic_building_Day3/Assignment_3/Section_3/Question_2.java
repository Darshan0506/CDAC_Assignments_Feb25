public class Question_2 {
  public static void main(String[] args) {
    int n = 10;
    int product = 1;
    while (n > 0) {
      product *= n;
      n--;
    }
    System.out.println(product);
  }
}