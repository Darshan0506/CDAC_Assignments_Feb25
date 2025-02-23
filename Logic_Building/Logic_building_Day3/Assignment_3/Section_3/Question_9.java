public class Question_9 {
  public static void main(String[] args) {
    int n = 4825;
    int maxi = 0;
    while (n != 0) {
      int temp = n % 10;
      if (maxi < temp) {
        maxi = temp;
      }
      n /= 10;
    }
    System.out.println(maxi);
  }
}
