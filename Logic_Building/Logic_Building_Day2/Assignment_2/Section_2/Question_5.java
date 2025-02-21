import java.util.Scanner;

public class Question_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of subject1:");
    int subject1 = sc.nextInt();

    System.out.print("Enter marks of subject2:");
    int subject2 = sc.nextInt();

    System.out.print("Enter marks of subject3:");
    int subject3 = sc.nextInt();

    int failedSubjects = 0;

    switch (subject1 >= 40 ? 0 : 1) {
      case 1:
        failedSubjects++;
        break;
    }

    switch (subject2 >= 40 ? 0 : 1) {
      case 1:
        failedSubjects++;
        break;
    }

    switch (subject3 >= 40 ? 0 : 1) {
      case 1:
        failedSubjects++;
        break;
    }

    switch (failedSubjects) {
      case 0:
        System.out.println("Student has passed in all subjects");
        break;

      default:
        System.out.println("Student has failed in " + failedSubjects + " subjects");
        break;
    }
  }
}
