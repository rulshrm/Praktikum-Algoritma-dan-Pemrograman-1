/*
Tugas: Gunakan loop for untuk membuat program sebagai berikut:
input : n
output : 1 -2 3 -4 5 -6 7 -8 … n
*/
package Modul4_Perulangan.ForLoop;

import java.util.Scanner;

public class TugasForLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input value n: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.print(" " + i);
      } else {
        System.out.print(" " + -i);
      }
    }
  }
}