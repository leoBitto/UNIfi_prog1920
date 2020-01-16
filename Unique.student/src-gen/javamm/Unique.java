package javamm;

@SuppressWarnings("all")
public class Unique {
  /**
   * Scrivere un metodo, chiamato unique,
   * che dato in input un array a di numeri
   * interi positivi (eventualmente vuoto),
   * restituisca l'array (eventualmente vuoto)
   * contenente gli elementi di a che appaiono
   * una sola volta in a stesso, nello stesso ordine
   * con cui essi appaiono in a.
   * 
   * ESEMPI
   * Input: {32,23,12,23,15,32}
   * Output: {12,15}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23}
   * Output: {12}
   * 
   * Input: {20,11,15,41,23}
   * Output: {20,11,15,41,23}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23,12}
   * Output: {}
   * 
   * Input: {}
   * Output: {}
   */
  public static int[] unique(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      for (int j = (i + 1); (j < a.length); j++) {
        boolean _tripleEquals = (a[i] == a[j]);
        if (_tripleEquals) {
          a[j] = -1;
          for (int k = j; (k < a.length); k++) {
            boolean _tripleEquals_1 = (a[i] == a[k]);
            if (_tripleEquals_1) {
              a[k] = -1;
            }
          }
          a[i] = -1;
        }
      }
    }
    int counter = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleNotEquals = (a[i] != -1);
      if (_tripleNotEquals) {
        counter++;
      }
    }
    int[] b = new int[counter];
    int index = 0;
    for (int i = 0; (i <= (a.length - 1)); i++) {
      boolean _tripleNotEquals = (a[i] != -1);
      if (_tripleNotEquals) {
        b[index] = a[i];
        index++;
      }
    }
    return b;
  }
  
  public static void main(String[] args) {
  }
}
