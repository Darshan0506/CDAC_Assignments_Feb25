class Question1 {
  static byte b;
  static short s;
  static int i;
  static long l;
  static float f;
  static double d;
  static boolean bl;
  static char c;
  static String str;

  public static void main(String[] args) {
    byte initializedB = 5;
    short initializedS = 132;
    int initializedI = 155566688;
    long initializedL = 54815314546131454l;
    float initializedF = 523.00f;
    double initilizedD = 523664.5844;
    boolean initializedBl = true;
    char initializedC = 'a';
    String initializedStr = "Darshan";
    System.out.println("Default values:");
    System.out.println("byte : " + b);
    System.out.println("short : " + s);
    System.out.println("int : " + i);
    System.out.println("long : " + l);
    System.out.println("float : " + f);
    System.out.println("double : " + d);
    System.out.println("boolean : " + bl);
    System.out.println("char : " + c);
    System.out.println("String : " + str);
    System.out.println("-------------------------------------------------");
    System.out.println("Initialized values:");
    System.out.println("byte : " + initializedB);
    System.out.println("short : " + initializedS);
    System.out.println("int : " + initializedI);
    System.out.println("long : " + initializedL);
    System.out.println("float : " + initializedF);
    System.out.println("double : " + initilizedD);
    System.out.println("boolean : " + initializedBl);
    System.out.println("char : " + initializedC);
    System.out.println("String : " + initializedStr);
  }
}