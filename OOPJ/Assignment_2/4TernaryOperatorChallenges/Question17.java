
//package 4TernaryOperatorChallenges;
import java.util.*;

public class Question17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int n1 = sc.nextInt();
    System.out.print("Enter 1st number: ");
    int n2 = sc.nextInt();
    System.out.print("Enter 1st number: ");
    int n3 = sc.nextInt();
    System.out.print("Enter 1st number: ");
    int n4 = sc.nextInt();

    int result = (n1 < n2) ? (n1 < n3 ? (n1 < n4 ? n1 : n4) : (n3 < n4 ? n3 : n4))
        : (n2 < n3 ? (n2 < n4 ? n2 : n4) : (n3 < n4 ? n3 : n4));
    System.out.println("Minimun of four numbers is: " + result);
    sc.close();
  }
}
