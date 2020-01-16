package javamm;

@SuppressWarnings("all")
public class LastDigit {
  public static boolean lastDigit(int a, int b, int c) {
    int a0 = (a % 10);
    int b0 = (b % 10);
    int c0 = (c % 10);
    return (((a0 == b0) || (a0 == c0)) || (b0 == c0));
  }
  
  public static void main(String[] args) {
  }
}
