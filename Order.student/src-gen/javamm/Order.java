package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    return ((noA && (b < c)) || ((a < b) && (b < c)));
  }
  
  public static void main(String[] args) {
  }
}
