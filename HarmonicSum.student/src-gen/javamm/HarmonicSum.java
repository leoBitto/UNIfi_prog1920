package javamm;

@SuppressWarnings("all")
public class HarmonicSum {
  public static int harmonicSum(int x) {
    double sumH = 0.0;
    int i = 1;
    while ((sumH < x)) {
      {
        double _H = HarmonicSum.H(i);
        double _plus = (sumH + _H);
        sumH = _plus;
        i++;
      }
    }
    return (i - 1);
  }
  
  public static double H(int n) {
    double sum = 0.0;
    double counter = 1;
    while ((counter <= n)) {
      {
        double _sum = sum;
        sum = (_sum + (1 / counter));
        counter++;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
