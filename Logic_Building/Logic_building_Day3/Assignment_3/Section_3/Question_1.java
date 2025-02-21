import java.util.Scanner;

class Question_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int n = sc.nextInt();

    int sumOfNNaturalNumbers = n * (n + 1) / 2;
    System.out.println("The sum of given n natural numbers is : " + sumOfNNaturalNumbers);
    sc.close();
  }
}