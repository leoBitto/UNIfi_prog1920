package javamm;

@SuppressWarnings("all")
public class Party {
  public static boolean party(int c, boolean s) {
    boolean drink = true;
    if (s) {
      if ((c <= 100)) {
        drink = true;
      } else {
        drink = false;
      }
    } else {
      if ((c <= 40)) {
        drink = true;
      } else {
        drink = false;
      }
    }
    return drink;
  }
  
  public static void main(String[] args) {
  }
}
