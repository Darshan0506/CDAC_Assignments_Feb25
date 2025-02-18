class Problem14 {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    int count = 3;
    while (count < 11) {
      int result = a + b;
      a = b;
      b = result;
      System.out.println(result);
      count++;
    }
  }
}
