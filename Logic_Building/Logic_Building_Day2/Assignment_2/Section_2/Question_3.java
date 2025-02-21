import java.util.Scanner;

public class Question_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter operator from (+,-,*,/):");
    char operator = sc.next().charAt(0);

    System.out.print("Enter 1st number:");
    int num1 = sc.nextInt();
    System.out.print("Enter 2nd number:");
    int num2 = sc.nextInt();

    switch (operator) {
      case '+':
        System.out.print("Addition of 2 numbers is: " + (num1 + num2));
        break;

      case '-':
        System.out.println("Subtraction of 2 numbers is: " + (num1 - num2));
        break;

      case '*':
        System.out.println("Multiplication of 2 numbers is: " + (num1 * num2));
        break;

      case '/':
        if (num2 == 0 && num1 == 0) {
          System.out.println("0/0 is indeterminate (infinite possible answers)");
        } else if (num2 == 0) {
          System.out.println("Division by zero is undefined");
        } else {
          double result = (double) num1 / num2;
          System.out.println("Division of 2 numbers is: " + result);
        }
        break;

      default:
        System.out.println("Enter a valid operator from given options");
        break;
    }
    sc.close();

  }
}
