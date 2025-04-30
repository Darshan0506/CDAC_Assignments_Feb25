class ain {
  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("darshan");
    StringBuffer sb2 = new StringBuffer("darshan");
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

    String s1 = new String("darshan");
    String s2 = new String("darshan");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}