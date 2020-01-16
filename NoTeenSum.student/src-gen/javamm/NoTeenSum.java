package javamm;

@SuppressWarnings("all")
public class NoTeenSum {
  public static int noTeenSum(int a, int b, int c) {
    int _fixTeen = NoTeenSum.fixTeen(a);
    int _fixTeen_1 = NoTeenSum.fixTeen(b);
    int _plus = (_fixTeen + _fixTeen_1);
    int _fixTeen_2 = NoTeenSum.fixTeen(c);
    return (_plus + _fixTeen_2);
  }
  
  public static int fixTeen(int a) {
    int rit = 0;
    if (((((a < 13) || (a > 19)) || (a == 15)) || (a == 16))) {
      rit = a;
    }
    return rit;
  }
  
  public static void main(String[] args) {
  }
}
