import java.util.Scanner;

class Problem18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temprature in Celsius:");
    float Celsius = sc.nextFloat();

    float fahrenheit = (Celsius * 9 / 5) + 32;
    System.out.println("Temprature in fahrenheit is : " + fahrenheit);
    sc.close();
  }
}
