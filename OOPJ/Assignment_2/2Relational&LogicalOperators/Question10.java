public class Question10 {
  public static void main(String[] args) {
    char c = 'z';
    int ch = c;
    String str = "AEIOUaeiou";
    String result = str.indexOf(ch) != -1 ? c + " is a vowel" : c + " is a consonant";
    System.out.println(result);
  }
}
