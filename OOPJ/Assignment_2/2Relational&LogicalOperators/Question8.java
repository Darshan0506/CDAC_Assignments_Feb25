import java.util.*;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean b1 = sc.nextBoolean();
    boolean b2 = sc.nextBoolean();
    boolean b3 = sc.nextBoolean();
    if (b1 && b2 || b2 && b3 || b3 && b1) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
    sc.close();
  }
}
