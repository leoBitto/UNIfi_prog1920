package javamm;

@SuppressWarnings("all")
public class StrikeBall {
  /**
   * Dati due numeri interi positivi n e m con lo stesso
   * numero di cifre, si ha uno strike tra n e m per
   * ogni coppia di cifre di n e m che sono uguali e
   * nella stessa posizione, mentre si ha un ball
   * tra n e m per ogni coppia di cifre di n e m che sono
   * uguali ma in posizione diversa. Ad esempio, se
   * n=180712 e m=781104, si ha uno strike in corrispondenza
   * dell'8 e quattro ball in corrispondenza dei due 1,
   * dello 0 e del 7.
   * Scrivere un metodo, chiamato strikeBall, che,
   * dati in input due numeri interi positivi n e m
   * con lo stesso numero di cifre, restituisca un array
   * di due elementi uguali al numero di strike e
   * al numero di ball tra n e m, rispettivamente.
   * Per calcolare il numero di strike e' sufficiente
   * calcolare il numero di cifre uguali in n e in m
   * che appaiono nella stessa posizione.
   * Per calcolare il numero di ball puo' invece
   * essere utile usare due array di 10 elementi che
   * indichino le frequenze delle 10 cifre decimali in
   * n e in m (senza pero' contare gli strike): il numero
   * di ball e' la somma, per i che va da 0 a 9, dei
   * minimi tra i due valori contenuti nei due array
   * in posizione i.
   * 
   * ESEMPI
   * Input: 180712, 781104
   * Output: {1, 4}
   * 
   * Input: 180712, 180712
   * Output: {6, 0}
   * 
   * Input: 180712, 211087
   * Output: {0, 6}
   * 
   * Input: 123321, 456654
   * Output: {0, 0}
   */
  public static int[] strikeBall(int n, int m) {
    int[] risultati = new int[2];
    int[] nArr = StrikeBall.arraizza(n);
    int[] mArr = StrikeBall.arraizza(m);
    risultati[0] = StrikeBall.strike(nArr, mArr);
    risultati[1] = StrikeBall.ball(nArr, mArr);
    return risultati;
  }
  
  public static int[] arraizza(int n) {
    int contacifre = 0;
    int segnaN = n;
    while ((segnaN > 0)) {
      {
        segnaN = (segnaN / 10);
        contacifre++;
      }
    }
    int[] Narray = new int[contacifre];
    for (int i = (contacifre - 1); (i >= 0); i--) {
      {
        Narray[i] = (n % 10);
        n = (n / 10);
      }
    }
    return Narray;
  }
  
  public static int strike(int[] n, int[] m) {
    int conta = 0;
    for (int i = 0; (i <= (n.length - 1)); i++) {
      boolean _tripleEquals = (n[i] == m[i]);
      if (_tripleEquals) {
        conta++;
      }
    }
    return conta;
  }
  
  public static int ball(int[] n, int[] m) {
    int conta = 0;
    int[] cifreN = new int[10];
    int[] cifreM = new int[10];
    for (int i = 0; (i <= 9); i++) {
      for (int j = 0; (j <= (n.length - 1)); j++) {
        if (((n[j] == i) && (n[j] != m[j]))) {
          cifreN[i]++;
        }
      }
    }
    for (int i = 0; (i <= 9); i++) {
      for (int j = 0; (j <= (n.length - 1)); j++) {
        if (((m[j] == i) && (m[j] != n[j]))) {
          cifreM[i]++;
        }
      }
    }
    for (int i = 0; (i <= 9); i++) {
      boolean _lessEqualsThan = (cifreN[i] <= cifreM[i]);
      if (_lessEqualsThan) {
        int _plus = (conta + cifreN[i]);
        conta = _plus;
      } else {
        int _plus_1 = (conta + cifreM[i]);
        conta = _plus_1;
      }
    }
    return conta;
  }
  
  public static void main(String[] args) {
    StrikeBall.strikeBall(180712, 781104);
  }
}
