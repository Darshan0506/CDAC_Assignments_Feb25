import java.util.Scanner;

class Problem19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter base number:");
    int base = sc.nextInt();

    System.out.print("Enter exponent number:");
    int expo = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= expo; i++) {
      result *= base;
    }
    System.out.println(result);
    sc.close();
  }
}
