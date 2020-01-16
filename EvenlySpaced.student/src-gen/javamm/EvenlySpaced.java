package javamm;

@SuppressWarnings("all")
public class EvenlySpaced {
  public static boolean evenlySpaced(int a, int b, int c) {
    int _mid = EvenlySpaced.mid(a, b, c);
    int _min = EvenlySpaced.min(a, b, c);
    int _minus = (_mid - _min);
    int _max = EvenlySpaced.max(a, b, c);
    int _mid_1 = EvenlySpaced.mid(a, b, c);
    int _minus_1 = (_max - _mid_1);
    return (_minus == _minus_1);
  }
  
  public static int min(int a, int b, int c) {
    int ritorno = 0;
    if (((a < b) && (a < c))) {
      ritorno = a;
    } else {
      if (((b < c) && (b < a))) {
        ritorno = b;
      } else {
        ritorno = c;
      }
    }
    return ritorno;
  }
  
  public static int max(int a, int b, int c) {
    int ritorno = 0;
    if (((a > b) && (a > c))) {
      ritorno = a;
    } else {
      if (((b > c) && (b > a))) {
        ritorno = b;
      } else {
        ritorno = c;
      }
    }
    return ritorno;
  }
  
  public static int mid(int a, int b, int c) {
    int ritorno = 0;
    if ((((a <= b) && (a >= c)) || ((a <= c) && (a >= b)))) {
      ritorno = a;
    } else {
      if ((((b <= c) && (b >= a)) || ((b <= a) && (b >= c)))) {
        ritorno = b;
      } else {
        ritorno = c;
      }
    }
    return ritorno;
  }
  
  public static void main(String[] args) {
  }
}
