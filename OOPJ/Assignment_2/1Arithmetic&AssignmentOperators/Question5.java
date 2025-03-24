public class Question5 {
  public static void main(String[] args) {
    int a = 25;
    int b = 130;
    a += b;
    b = a + (-b);
    a = a + (-b);
    System.out.println(a);
    System.out.println(b);
  }
}
