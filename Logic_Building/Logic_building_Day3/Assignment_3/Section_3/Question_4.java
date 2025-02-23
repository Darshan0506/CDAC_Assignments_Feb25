public class Question_4 {
  public static void main(String[] args) {
    int n = 1234;
    int result = 0;
    while (n != 0) {
      result *= 10;
      result += (n % 10);
      n /= 10;
    }
    System.out.println(result);
  }
}
