import java.util.*;

public class Question18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student's percentage (upto 2 decimal): ");
    float perc = sc.nextFloat();
    String result = (perc >= 40) ? "Pass" : "Fail";
    System.out.println("Result : " + result);
    sc.close();
  }
}
