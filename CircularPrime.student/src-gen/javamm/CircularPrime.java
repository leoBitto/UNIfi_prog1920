package javamm;

@SuppressWarnings("all")
public class CircularPrime {
  /**
   * Un numero positivo n e' primo se e' maggiore di 1 e se e' divisibile			1 CRIVELLO==>TUTTI I NUMERI MINORI E PRIMI
   * solo per 1 e per se stesso. Un numero primo e' circolare se ogni sua 		2 PER OGNI NUMERO MINORE E PRIMO
   * permutazione circolare e' anche un numero primo. Ad esempio, 113 e' 				2A CALCOLA PERMUTAZIONI
   * un numero primo circolare in quanto anche 131 e 311 sono numeri primi. 		3 PER OGNI PERMUTAZIONE CONTROLLA SE PRIMO
   * Al contrario, 29 non e' circolare in quanto 92 non e' primo. Osserviamo 		4 SE TUTTI PRIMI AUMENTA CONTATORE
   * che un numero primo che contiene lo 0 tra le sue cifre non puo' essere un 	5 RESTITUISCI CONTATORE
   * numero primo circolare: ad esempio, il numero primo 101 ha la permutazione
   * circolare 110 che, chiaramente, non è un numero primo. Scrivere un metodo,
   * chiamato circularPrime, che dato in input un numero intero n positivo,
   * restituisca il numero di numeri primi circolari minori o uguali a n.
   * Per definire il metodo si suggerisce di fare uso del metodo del crivello
   * di Eratostene, cosi' definito. Si considerano tutti i numeri interi a
   * partire da 2 fino a n. Poi si "cancellano" tutti i multipli di 2
   * (escluso 2 stesso). Si prende poi il primo numero non cancellato maggiore
   * di 2 e si ripete l'operazione con i suoi multipli (escluso lui stesso),
   * proseguendo in questo modo fino a che non si applica l'operazione
   * all'ultimo numero non cancellato. I numeri che non sono stati cancellati
   * sono i numeri primi minori o uguali a n.
   * 
   * ESEMPI
   * Input: 100
   * Output: 13
   * 
   * Input: 200
   * Output: 17
   * 
   * Input: 300
   * Output: 17
   * 
   * Input: 400
   * Output: 20
   */
  public static int circularPrime(int n) {
    int PMC = 0;
    int[] a = new int[(n - 1)];
    for (int i = 0; (i < a.length); i++) {
      a[i] = (i + 2);
    }
    CircularPrime.print(a);
    CircularPrime.print(CircularPrime.eratostene(a));
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleNotEquals = (a[i] != -1);
      if (_tripleNotEquals) {
        System.out.println(a[i]);
        boolean _isCircular = CircularPrime.isCircular(a[i]);
        boolean _tripleEquals = (Boolean.valueOf(_isCircular) == Boolean.valueOf(true));
        if (_tripleEquals) {
          PMC++;
        }
      }
    }
    System.out.println(("numero di primi circolari minori di n: " + Integer.valueOf(PMC)));
    return PMC;
  }
  
  public static void print(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      String _plus = (" " + Integer.valueOf(a[i]));
      System.out.print(_plus);
    }
    System.out.println();
  }
  
  public static boolean isPrime(int n) {
    boolean itIs = true;
    for (int i = 2; (i < (n / 2)); i++) {
      if (((n % i) == 0)) {
        itIs = false;
      }
    }
    return itIs;
  }
  
  public static boolean isCircular(int c) {
    int numCif = 0;
    int p = c;
    while ((p > 0)) {
      {
        p = (p / 10);
        numCif++;
      }
    }
    int perm = c;
    while (CircularPrime.isPrime(perm)) {
      {
        int rimosso = (perm % 10);
        int shifted = (perm / 10);
        double _pow = Math.pow(10, (numCif - 1));
        double _multiply = (_pow * rimosso);
        double _plus = (_multiply + shifted);
        perm = ((int) _plus);
        if ((perm == c)) {
          System.out.println(("circolare: " + Integer.valueOf(c)));
          return true;
        }
      }
    }
    return false;
  }
  
  public static int[] eratostene(int[] a) {
    int p = 2;
    int j = 0;
    while ((j < (a.length / 2))) {
      {
        for (int i = j; (i < a.length); i = (i + p)) {
          boolean _lessEqualsThan = (a[i] <= p);
          if (_lessEqualsThan) {
            continue;
          } else {
            a[i] = -1;
          }
        }
        while (((a[j] <= p) && (j < (a.length - 1)))) {
          j++;
        }
        boolean _tripleNotEquals = (a[j] != -1);
        if (_tripleNotEquals) {
          p = a[j];
        } else {
          break;
        }
      }
    }
    return a;
  }
  
  public static void main(String[] args) {
    CircularPrime.circularPrime(100);
  }
}
