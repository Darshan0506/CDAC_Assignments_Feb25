import java.util.Scanner;

public class Question_4 {
  public static void main(String[] args) {
    // using if else
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total purchase amount: ");
    int amount = sc.nextInt();
    sc.nextLine();
    if (amount < 0) {
      System.out.print("Enter a valid amount");
      sc.close();
      return;
    }
    int discountPercentage = 0;
    System.out.print("Has a membership card?(yes/no)");
    String flag = sc.nextLine().trim().toLowerCase();
    if (amount >= 1000) {
      discountPercentage = flag.equals("yes") ? 25 : 20;
    } else if (amount >= 500) {
      discountPercentage = flag.equals("yes") ? 20 : 15;
    } else {
      discountPercentage = flag.equals("yes") ? 15 : 10;
    }

    int discountAmount = amount * discountPercentage / 100;
    int finalAmount = amount - discountAmount;
    System.out.println("Final purchase amount:" + finalAmount);
    // using case switch
    /*
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter the total purchase amount: ");
     * int amount = sc.nextInt();
     * sc.nextLine();
     * if (amount < 0) {
     * System.out.print("Enter a valid amount");
     * } else {
     * System.out.print("Has a membership card?(yes/no)");
     * String flag = sc.nextLine().trim().toLowerCase();
     * if (amount >= 1000) {
     * switch (flag) {
     * case "yes":
     * int discount = amount * 25 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * 
     * default:
     * discount = amount * 20 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * }
     * } else if (amount >= 500) {
     * switch (flag) {
     * case "yes":
     * int discount = amount * 15 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * 
     * default:
     * discount = amount * 10 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * }
     * } else {
     * switch (flag) {
     * case "yes":
     * int discount = amount * 10 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * 
     * default:
     * discount = amount * 5 / 100;
     * System.out.println("Final amount is:" + (amount - discount));
     * break;
     * }
     * }
     * }
     * sc.close();
     */

    sc.close();
  }
}
