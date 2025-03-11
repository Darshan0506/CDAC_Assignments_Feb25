public class Question12 {
  public static void main(String[] args) {
    int a = 58;
    int b = 12;
    System.out.println("a+=b : " + assigmentOperations(a, b, '+'));
    System.out.println("a-=b : " + assigmentOperations(a, b, '-'));
    System.out.println("a%=b : " + assigmentOperations(a, b, '%'));
    System.out.println("a/=b : " + assigmentOperations(a, b, '/'));
    System.out.println("a*=b : " + assigmentOperations(a, b, '*'));
    a = b;
    System.out.println("a=b: " + a);

  }

  public static int assigmentOperations(int a, int b, char ch) {
    if (ch == '+') {
      return a += b;
    } else if (ch == '-') {
      return a -= b;
    } else if (ch == '%') {
      return a %= b;
    } else if (ch == '/') {
      return a /= b;
    } else if (ch == '*') {
      return a *= b;
    } else {
      return -1;
    }
  }
}
