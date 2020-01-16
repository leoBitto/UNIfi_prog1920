package javamm;

@SuppressWarnings("all")
public class HIndex {
  /**
   * Dato un array a di n numeri interi non negativi, l'indice H di a
   * e' definito come il massimo valore h, compreso tra 1 ed n, tale
   * l'h-esimo elemento di a in ordine non crescente sia non inferiore
   * ad h. Ad esempio, l'indice H di
   * {2, 0, 3, 5, 6, 5, 4, 3, 2, 0, 1, 7, 0, 9}
   * e' 5, in quanto il quinto elemento in ordine non crescente e' 5
   * (che e' uguale a 5), mentre il sesto elemento in ordine non
   * crescente e' 4 (che e' minore di 6). Analogamente, l'indice H di
   * {23, 1, 3, 14, 6, 15, 4, 13, 2, 10, 1, 17, 20, 19}
   * e' 8, in quanto l'ottavo elemento in ordine non crescente e' 10
   * (che e' maggiore di 8), mentre il nono elemento in ordine non
   * crescente e' 6 (che e' minore di 9). Infine, l'indice H di un
   * array di elementi tutti uguali a 0 e', per convenzione, uguale a 0.
   * Scrivere un metodo, chiamato hIndex, che dato in input un
   * array di numeri interi non negativi, restituisce il suo indice H.
   */
  public static int hIndex(int[] a) {
    int len = a.length;
    int[] counter = new int[(len + 1)];
    for (int c : a) {
      counter[Math.min(len, c)]++;
    }
    int k = len;
    {
      int s = counter[len];
      boolean _while = (k > s);
      while (_while) {
        k--;
        int _s = s;
        s = (_s + counter[k]);
        _while = (k > s);
      }
    }
    return k;
  }
  
  public static void main(String[] args) {
  }
}
