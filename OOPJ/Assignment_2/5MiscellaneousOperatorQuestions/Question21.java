class Question21 {
  public static int increment(int x) {
      return -~x; // Using bitwise NOT (~) and negation (-)
  }

  public static void main(String[] args) {
      int num = 5;
      int result = increment(num);
      System.out.println("Incremented value: " + result);
  }
}
