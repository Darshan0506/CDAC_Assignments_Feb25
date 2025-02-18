import java.util.Scanner;

class Problem15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");

    int num = sc.nextInt();
    sc.close();
    long factorial = 1;

    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of give number is : " + factorial);
  }
}