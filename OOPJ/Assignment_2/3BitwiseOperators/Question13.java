import java.util.*;

public class Question13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int mask = n >> 31;
    int abs = (n ^ mask) - mask;
    System.out.println("Absolute value of the number is: " + abs);
    sc.close();

  }
}
