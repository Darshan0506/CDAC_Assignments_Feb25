import java.util.Scanner;

class Problem12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    sc.close();
    int result = 0;
    while (num != 0) {
      int lastDigit = num % 10;
      result = result * 10 + lastDigit;
      num /= 10;
    }
    System.out.println(result);
  }
}
