package javamm;

@SuppressWarnings("all")
public class IsSum {
  public static boolean isSum(int a, int b, int c) {
    return ((((a + b) == c) || ((a + c) == b)) || ((b + c) == a));
  }
  
  public static void main(String[] args) {
  }
}
