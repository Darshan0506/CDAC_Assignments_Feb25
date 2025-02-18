import java.util.Scanner;

class Problem13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st Number:");
    int num1 = sc.nextInt();

    System.out.print("Enter 2nd Number:");
    int num2 = sc.nextInt();

    System.out.print("Enter 3rd Number:");
    int num3 = sc.nextInt();

    float result = (num1 + num2 + num3) / 3;
    System.out.println(result);

    sc.close();
  }

}
