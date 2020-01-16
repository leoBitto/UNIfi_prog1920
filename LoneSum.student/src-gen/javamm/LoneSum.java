package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    int sum = 0;
    if ((a != b)) {
      sum = (a + b);
      if (((a != c) && (b != c))) {
        int _sum = sum;
        sum = (_sum + c);
      } else {
        int _sum_1 = sum;
        sum = (_sum_1 - c);
      }
    } else {
      if ((b != c)) {
        sum = c;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
