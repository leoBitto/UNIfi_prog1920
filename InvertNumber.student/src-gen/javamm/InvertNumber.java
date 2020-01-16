package javamm;

@SuppressWarnings("all")
public class InvertNumber {
  public static int invertNumber(int n) {
    int numero = 0;
    if (((n % 10) != 0)) {
      int _numero = numero;
      numero = (_numero + (n % 10));
      n = (n / 10);
      while ((n > 0)) {
        {
          numero = ((numero * 10) + (n % 10));
          n = (n / 10);
        }
      }
    }
    return numero;
  }
  
  public static void main(String[] args) {
  }
}
