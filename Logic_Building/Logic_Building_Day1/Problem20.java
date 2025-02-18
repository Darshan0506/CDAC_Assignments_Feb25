import java.util.Scanner;

class Problem20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();

    String str1 = Integer.toString(num);
    int result = str1.length();
    System.out.println("The no of digits in give number is : " + result);
    sc.close();

  }
}
