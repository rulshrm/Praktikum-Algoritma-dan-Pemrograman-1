package Modul4_Perulangan.ForLoop;
/*
* For (inisialisasi; kondisiloop; iterasi){
  * statement
*}
 */

public class ForLoopExample {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}
