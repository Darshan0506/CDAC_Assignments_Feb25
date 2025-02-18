import java.util.Scanner;

class Problem16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    sc.close();

    if (num < 2) {
      System.out.println("Given number is Not Prime");
      return;
    }
    if (num == 2 || num == 3) {
      System.out.println("Given number is prime");
      return;
    }
    if (num % 2 == 0) {
      System.out.println("Given number is not Prime");
      return;
    }

    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0) {
        System.out.println("Given number is not Prime");
        return;
      }
    }
    System.out.println("Given number is Prime");

  }
}
