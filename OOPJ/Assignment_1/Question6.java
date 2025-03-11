public class Question6 {
  public static void main(String[] args) {
    char c = 'a';
    System.out.println("Character value: " + c);
    int a = c;
    System.out.println("ASCII value of 'a' is: " + a);
    String str = "Darshan";
    System.out.print("ASCII value of 'Darshan' is: ");
    for (char ch : str.toCharArray()) {
      int num = ch;
      System.out.print(num + " ");
    }

  }
}
