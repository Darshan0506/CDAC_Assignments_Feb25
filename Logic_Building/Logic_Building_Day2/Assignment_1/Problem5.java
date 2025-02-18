import java.util.Scanner;

public class Problem5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side of square:");
    int side = sc.nextInt();

    int area = side * side;
    System.out.println("Area of square is " + area);
    sc.close();
  }
}
