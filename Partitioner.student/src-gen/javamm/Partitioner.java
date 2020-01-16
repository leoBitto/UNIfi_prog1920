package javamm;

@SuppressWarnings("all")
public class Partitioner {
  /**
   * Scrivere un metodo, chiamato partition, che,
   * dato in input un array a di numeri interi,
   * restituisca il valore true se e solo se esiste un
   * sottoinsieme degli elementi di a la cui somma sia
   * uguale alla metà della somma di tutti gli elementi
   * di a. Ad esempio, con input l'array {1,6,2,3,4,2,1,3}
   * il metodo deve restituire il valore true in quanto
   * il sottoinsieme formati da 1, 6 e 4 ha somma uguale
   * a 11 e la somma di tutti gli elementi di a e' uguale
   * a 22.
   * 
   * ESEMPI
   * Input: {1,6,2,3,4,2,1,3}
   * Output: true
   * 
   * Input: {3, 34, 4, 12, 5, 2}
   * Output: false
   * 
   * Input: {-1,6,-2,3,6,-2,2,-6}
   * Output: true
   * 
   * Input: {-1,5,-2,3,6,-2,2,-6,0}
   * Output: false
   */
  public static boolean partition(int[] a) {
    boolean exist = false;
    int tSum = 0;
    for (int i = 0; (i < a.length); i++) {
      int _tSum = tSum;
      tSum = (_tSum + a[i]);
    }
    tSum = (tSum / 2);
    int sum = 0;
    while ((tSum != sum)) {
      {
        sum = Partitioner.Summa(a, 1);
        if ((sum == tSum)) {
          exist = true;
          break;
        }
      }
    }
    return exist;
  }
  
  public static int Summa(int[] a, int n) {
    int sum = 0;
    for (int i = 0; (i < a.length); i++) {
      for (int j = 0; (j < a.length); j++) {
        if ((j != i)) {
          int _plus = (sum + a[i]);
          sum = _plus;
        }
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4 };
    System.out.println(Partitioner.Summa(a, 1));
  }
}
