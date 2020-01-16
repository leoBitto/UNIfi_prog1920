package javamm;

@SuppressWarnings("all")
public class Frequences {
  /**
   * Scrivere un metodo, detto frequences, che, dato
   * in input un array a di numeri interi non vuoto,
   * restituisca l'array delle frequenze degli
   * elementi distinti di a, in ordine crescente
   * dei valori degli elementi. Ad esempio, con
   * input il vettore {1,6,5,8,6,6,8,5,3,1,6,8},
   * il metodo deve restituire l'array {2,1,2,4,3},
   * in quanto il valore 1 appare due volte, il 3
   * una volta, il 5 due volte, il 6 quattro volte
   * e l'8 tre volte. L'array in input non deve essere
   * modificato dall'esecuzione del metodo.
   * 
   * ESEMPI
   * Input: {1,6,5,8,6,6,8,5,3,1,6,8}
   * Output: {2,1,2,4,3}
   * 
   * Input: {6,6,6,6}
   * Output: {4}
   * 
   * b: {2,2,2,3,3,5,5,6}
   * Output: {3,2,2,1}
   */
  public static int[] frequences(int[] a) {
    int[] b = Frequences.ordina(a);
    int counter = 1;
    for (int i = 0; (i < (b.length - 1)); i++) {
      boolean _tripleNotEquals = (b[(i + 1)] != b[i]);
      if (_tripleNotEquals) {
        counter++;
      }
    }
    Frequences.print(b);
    int[] res = new int[counter];
    for (int i = 0; (i < res.length); i++) {
      res[i] = 1;
    }
    Frequences.print(res);
    int k = 0;
    for (int i = 0; (i < (b.length - 1)); i++) {
      boolean _tripleEquals = (b[i] == b[(i + 1)]);
      if (_tripleEquals) {
        res[k]++;
      } else {
        k++;
      }
    }
    Frequences.print(res);
    return res;
  }
  
  public static void print(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      String _plus = (" " + Integer.valueOf(a[i]));
      System.out.print(_plus);
    }
    System.out.println();
  }
  
  public static int[] ordina(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      b[i] = a[i];
    }
    for (int i = 0; (i < b.length); i++) {
      for (int j = (i + 1); (j < b.length); j++) {
        boolean _lessThan = (b[j] < b[i]);
        if (_lessThan) {
          int t = b[i];
          b[i] = b[j];
          b[j] = t;
        }
      }
    }
    return b;
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 6, 5, 8, 6, 6, 8, 5, 3, 1, 6, 8 };
    Frequences.frequences(a);
  }
}
