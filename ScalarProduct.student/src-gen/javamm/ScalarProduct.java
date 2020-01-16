package javamm;

@SuppressWarnings("all")
public class ScalarProduct {
  public static int scalarProduct(int[] a, int[] b) {
    int somma = 0;
    for (int i = 0; (i <= (a.length - 1)); i++) {
      int _multiply = (a[i] * b[i]);
      int _plus = (somma + _multiply);
      somma = _plus;
    }
    return somma;
  }
  
  public static void main(String[] args) {
  }
}
