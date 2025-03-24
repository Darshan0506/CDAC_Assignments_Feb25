import java.util.*;

public class Question15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int swappedInteger = ((n & 0xAAAAAAAA) >> 1 | (n & 0x55555555) << 1);
    System.out.println("After swapping even and odd bits integer is: " + swappedInteger);
    sc.close();
  }
}
