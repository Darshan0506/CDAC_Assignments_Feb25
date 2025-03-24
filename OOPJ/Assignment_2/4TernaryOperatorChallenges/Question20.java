import java.util.*;

public class Question20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int abs = (n < 0) ? (~n + 1) : (n > 0) ? n : 0;
    System.out.println("Absolute value of number is: " + abs);
    sc.close();
  }
}
