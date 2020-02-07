package javamm;

@SuppressWarnings("all")
public class StrangePartitioner {
  public static void stampaArray(int[] a) {
    for (int i = 0; (i < a.length); i++) {
      String _plus = (Integer.valueOf(a[i]) + ", ");
      System.out.print(_plus);
    }
    System.out.println();
  }
  
  public static int sommaTot(int[] a) {
    int somma = 0;
    for (int i = 0; (i < a.length); i++) {
      int _somma = somma;
      somma = (_somma + a[i]);
    }
    return somma;
  }
  
  public static boolean check(int[] a, int[] c) {
    int sum = 0;
    boolean r = false;
    for (int i = 0; (i < a.length); i++) {
      int _sum = sum;
      sum = (_sum + a[i]);
    }
    if ((((sum % 10) == 0) && (((StrangePartitioner.sommaTot(c) - sum) % 2) != 0))) {
      r = true;
    }
    return r;
  }
  
  public static void generaSub(int[] a, int[] c, int b) {
    if ((b == 0)) {
      System.out.print("a: ");
      StrangePartitioner.stampaArray(a);
      System.out.print("c: ");
      StrangePartitioner.stampaArray(c);
      System.out.println();
    } else {
      a[(b - 1)] = 0;
      StrangePartitioner.generaSub(a, c, (b - 1));
      a[(b - 1)] = c[(b - 1)];
      StrangePartitioner.generaSub(a, c, (b - 1));
    }
  }
  
  public static void main(String[] args) {
    int[] a = { 5, 5, 6, 1 };
    int[] c = new int[a.length];
    StrangePartitioner.generaSub(c, a, 4);
  }
}
