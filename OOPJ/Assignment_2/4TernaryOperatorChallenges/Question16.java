import java.util.*;

public class Question16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    String result = (num > 0) ? "Number is positive" : (num < 0) ? "Number is negative" : "Given Integer is zero";
    System.out.println(result);
    sc.close();
  }
}
