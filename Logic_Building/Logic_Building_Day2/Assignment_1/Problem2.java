import java.util.Scanner;

class Problem2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println("Number is negative");
    } else {
      System.out.println("Number is not negative");
    }
    sc.close();
  }
}
