package javamm;

@SuppressWarnings("all")
public class PalindromeArray {
  public static boolean palindrome(int[] a) {
    boolean truth = true;
    for (int i = 0; (i < (a.length / 2)); i++) {
      boolean _tripleNotEquals = (a[i] != a[((a.length - 1) - i)]);
      if (_tripleNotEquals) {
        truth = false;
      }
    }
    return truth;
  }
  
  public static void main(String[] args) {
  }
}
