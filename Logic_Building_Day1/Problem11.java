class Problem11 {
  public static void main(String[] args) {
    int a = 12;
    int b = 45;
    int c = 22;
    int max=a;

    if(b>max){
      max=b;
    }
    if(c>max){
      max=c;
    }

    System.out.println(max);
  }
}
