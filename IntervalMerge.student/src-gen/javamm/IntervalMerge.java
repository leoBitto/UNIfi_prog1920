package javamm;

@SuppressWarnings("all")
public class IntervalMerge {
  /**
   * Dati 2 intervalli chiusi [a,b] e [c,d] che
   * si sovrappongono (ovvero tali che a<=c<=b),
   * la loro fusione consiste dell'intervallo [a,max(b,d)].
   * Dati n intervalli chiusi, specificati dai due estremi
   * sinistro e destro e ordinati in modo non decrescente
   * rispetto agli estremi sinistri, la fusione di questi
   * intervalli consiste nel fondere tutti gli intervalli
   * che si sovrappongono. Ad esempio, la fusione degli
   * intervalli [1, 3],[2, 6],[8, 10] e [15, 18] restituisce
   * gli intervalli [1,6],[8,10] e [15,18] , la fusione degli
   * intervalli [1, 3],[2, 4],[5, 7] e [6, 8] restituisce gli
   * intervalli [1,4] e [5,8], e la fusione degli intervalli
   * [3, 6],[5, 7],[6, 12],[10, 12],[11, 16] restituisce
   * l'intervallo [3,16]. Scrivere un metodo, chiamato intervalMerge,
   * che data un input una matrice di interi positivi di
   * dimensione nx2, rappresentante n intervalli chiusi ordinati
   * in modo non decrescente rispetto alla prima colonna,
   * restituisca la matrice degli intervalli ottenuti dalla
   * fusione degli n intervalli.
   * 
   * ESEMPI
   * Input: {{1, 3}, {2, 6}, {8, 10}, {15, 18}}
   * Output: {{1, 6}, {8, 10}, {15, 18}}
   * 
   * Input: {{1, 3}, {2, 4}, {5, 7}, {6, 8}}
   * Output: {{1, 4}, {5, 8}}
   * 
   * Input: {{3, 6}, {5, 7}, {6, 12}, {10, 12}, {11, 16}}
   * Output: {{3, 16}}.
   */
  public static void printMatrix(int[][] a) {
    System.out.println(a.length);
    System.out.println(a[0].length);
  }
  
  public static int[] merge(int[] a, int[] b) {
    int[] r = new int[2];
    r[0] = a[0];
    int a1 = a[1];
    int b1 = b[1];
    if ((a1 <= b1)) {
      r[1] = a1;
    } else {
      r[1] = b1;
    }
    return r;
  }
  
  public static int[][] intervalMerge(int[][] m) {
    int counter = m.length;
    for (int i = 0; (i < (m.length - 1)); i++) {
      boolean _greaterEqualsThan = (m[i][1] >= m[(i + 1)][0]);
      if (_greaterEqualsThan) {
        counter--;
      }
    }
    System.out.println(("counter: " + Integer.valueOf(counter)));
    int[][] r = new int[counter][2];
    int index = 0;
    while ((index < r.length)) {
      for (int i = 0; (i < (m.length - 1)); i++) {
        {
          System.out.println(("indice di m: " + Integer.valueOf(i)));
          boolean _greaterEqualsThan = (m[i][1] >= m[(i + 1)][0]);
          if (_greaterEqualsThan) {
            System.out.println(("indice di r: " + Integer.valueOf(index)));
            int[] temp = IntervalMerge.merge(m[i], m[(i + 1)]);
            r[index][0] = temp[0];
            r[index][1] = temp[1];
            index++;
          }
        }
      }
    }
    return r;
  }
  
  public static void main(String[] args) {
    int[][] a = { new int[] { 1, 3 }, new int[] { 2, 6 }, new int[] { 8, 10 }, new int[] { 15, 18 } };
    IntervalMerge.intervalMerge(a);
  }
}
