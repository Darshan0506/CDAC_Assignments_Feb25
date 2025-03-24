class Question25 {
  public static int reverseNumber(int n) {
      int rev = 0;

      while (n != 0) {
          rev = rev * 10 + n % 10; // Extract last digit and add to rev
          n /= 10; // Remove last digit from n
      }

      return rev;
  }

  public static void main(String[] args) {
      int num = 12345;
      int reversed = reverseNumber(num);
      System.out.println("Reversed number: " + reversed);
  }
}