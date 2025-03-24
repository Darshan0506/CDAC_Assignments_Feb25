public class Question3 {
  public static void main(String[] args) {
    int num = 4562;
    int sum = 0;
    while (num != 0) {
      int rem = num % 10;
      sum += rem;
      num -= rem;
      num /= 10;
    }
    System.out.println(sum);
  }
}
