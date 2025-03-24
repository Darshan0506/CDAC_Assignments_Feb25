import java.util.Scanner;

public class Question23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    String result = ((num & 1) == 1) ? "Given number is Odd" : "Given numbers is even";
    System.out.println(result);
    sc.close();
  }
}
