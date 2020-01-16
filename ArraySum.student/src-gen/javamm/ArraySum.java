package javamm;

@SuppressWarnings("all")
public class ArraySum {
  public static int[] arraySum(int[] a, int[] b) {
    for (int i = 0; (i <= (a.length - 1)); i++) {
      int _plus = (a[i] + b[i]);
      a[i] = _plus;
    }
    return a;
  }
  
  public static void main(String[] args) {
  }
}
