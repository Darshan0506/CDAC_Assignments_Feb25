import java.util.Scanner;

class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();

    if (num > 0) {
      System.out.println("Number is positive");
    } else {
      System.out.println("Number is not positive");
    }
    sc.close();
  }
}