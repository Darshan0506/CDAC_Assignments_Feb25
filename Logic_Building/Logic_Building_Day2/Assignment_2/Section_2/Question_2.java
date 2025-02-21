import java.util.Scanner;

public class Question_2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number (1-7) for the day of the week:");
    int day = scanner.nextInt();

    switch (day) {
      case 1:
        System.out.println("Monday");
        switch (day) {
          default:
            System.out.println("It is a weekday.");
        }

        break;

      case 2:
        System.out.println("Tuesday");
        switch (day) {
          default:
            System.out.println("It is a weekday.");
        }
        break;

      case 3:
        System.out.println("Wednesday");
        switch (day) {
          default:
            System.out.println("It is a weekday.");
        }
        break;

      case 4:
        System.out.println("Thursday");
        switch (day) {
          default:
            System.out.println("It is a weekday.");
        }
        break;

      case 5:
        System.out.println("Friday");
        switch (day) {
          default:
            System.out.println("It is a weekday.");
        }
        break;

      case 6:
        System.out.println("Saturday");
        switch (day) {
          default:
            System.out.println("It is a weekend.");
        }
        break;
      case 7:
        System.out.println("Sunday");
        switch (day) {
          default:
            System.out.println("It is a weekend.");
        }
        break;
      default:
        System.out.println("Invalid input! Please enter a number between 1 and 7.");
    }

    scanner.close();
  }
}