package Modul4_Perulangan.Tugas;

public class Modul4_1 {
  public static void main(String[] args) {
    int n = 11;
    // Bagian atas belah ketupat
    for (int i = 1; i <= n; i++) {
      // Cetak spasi
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Cetak bintang
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    // Bagian bawah belah ketupat
    for (int i = n-1; i >= 1; i--) {
      // Cetak spasi
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Cetak bintang
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
