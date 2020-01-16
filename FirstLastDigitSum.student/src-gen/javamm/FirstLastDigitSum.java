package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    int last = (n % 10);
    int first = n;
    while ((first >= 10)) {
      first = (first / 10);
    }
    return (first + last);
  }
  
  public static void main(String[] args) {
  }
}
