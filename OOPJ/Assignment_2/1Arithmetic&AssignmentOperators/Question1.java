public class Question1 {
  public static void main(String[] args) {
    int a = 25;
    int b = 20;
    a = a ^ b;
    b = a ^ b; // cause a already has mix of a and b so XOR b will cancel out b and will give a
    // now b contain value of a

    a = a ^ b; // XORing a, which has mix of a and b with b(which now contains value of a )
               // will cancel out a and
    // remaining will be b
    System.out.println(a);
    System.out.println(b);
  }
}
