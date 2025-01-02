package Modul4_Perulangan.DoWhileLoop;

public class DoWhileLoopExample {
  /*
   * do {
   * statment;
   * } while (kondisi);
   */
  public static void main(String[] args) {
    int c;
    double f;
    System.out.println("=".repeat(20));
    System.out.println("Celcius Fahrenheit");
    System.out.println("=".repeat(20));

    c = 1;
    do {
      f = 1.8 * c + 32;
      System.out.println("Celcius: " + c + " Fahrenheit: " + f);
      c++;
    } while (c <= 10);
  }
}
