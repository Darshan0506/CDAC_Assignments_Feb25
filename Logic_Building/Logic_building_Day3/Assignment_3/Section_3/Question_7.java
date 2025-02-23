public class Question_7 {
  public static void main(String[] args) {
    int n = 9876;
    int result = 0;
    while (n != 0) {
      result += (n % 10);
      n /= 10;
    }
    System.out.println(result);
  }
}
