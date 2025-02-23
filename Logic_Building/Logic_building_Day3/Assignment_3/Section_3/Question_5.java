public class Question_5 {
  public static void main(String[] args) {
    int first = 0;
    int second = 1;
    while (first <= 21) {
      System.out.println(first);
      int result = first + second;
      first = second;
      second = result;
    }
  }
}
