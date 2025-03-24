import java.util.Scanner;

public class Question19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character: ");
    String str = sc.next().trim();
    int ch = str.charAt(0);
    String result = (ch > 66 && ch < 91) ? "Uppercase Character"
        : (ch > 96 && ch < 123) ? "Lowercase Character" : "Other Character";
    System.out.println("Given Character is: " + result);
    sc.close();
  }
}
