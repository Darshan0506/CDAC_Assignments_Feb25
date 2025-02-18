import java.util.Scanner;

class Problem6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of rectangle:");
    int l = sc.nextInt();
    System.out.print("Enter width of rectangle:");
    int w = sc.nextInt();

    int area = l * w;

    System.out.println("Area of rectangle: " + area);
    sc.close();
  }
}
