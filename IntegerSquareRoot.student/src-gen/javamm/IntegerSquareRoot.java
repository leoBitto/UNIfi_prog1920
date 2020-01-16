package javamm;

@SuppressWarnings("all")
public class IntegerSquareRoot {
  public static int integerSquareRoot(int n) {
    int sqr = 0;
    while (((sqr * sqr) <= n)) {
      sqr++;
    }
    return (sqr - 1);
  }
  
  public static void main(String[] args) {
  }
}
