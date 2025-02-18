class Problem8 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    System.out.println("Before Swapping : ");
    System.out.println("First Number : " + a);
    System.out.println("Second Number : " + b);

    int temp = 0;
    temp = a;
    a = b;
    b = temp;

    System.out.println("After Swapping : ");
    System.out.println("First Number : " + a);
    System.out.println("Second Number : " + b);
  }
}
