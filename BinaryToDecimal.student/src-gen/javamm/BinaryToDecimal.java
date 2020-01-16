package javamm;

@SuppressWarnings("all")
public class BinaryToDecimal {
  public static long decimal(int[] a) {
    long sum = 0;
    for (int i = 0; (i < a.length); i++) {
      int _length = a.length;
      int _minus = (_length - 1);
      int _minus_1 = (_minus - i);
      double _pow = Math.pow(2, _minus_1);
      int _multiply = (a[i] * ((int) _pow));
      long _plus = (sum + _multiply);
      sum = _plus;
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
