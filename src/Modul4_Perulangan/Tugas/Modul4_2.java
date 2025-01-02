package Modul4_Perulangan.Tugas;

import java.util.Scanner;

public class Modul4_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan berapa biaya awal: ");
    int a = input.nextInt();
    System.out.print("Berapa cicilan yang mampu dibayarkan tiap bulan: ");
    int b = input.nextInt();
    System.out.print("Berapa rata-rata kenaikan tiap tahun (%): ");
    int c = input.nextInt();

    // Inisialisasi variabel
    int biayaHaji = a;
    int totalTabungan = 0;
    int bulan = 0;

    while (totalTabungan < biayaHaji) {
      totalTabungan += b;
      bulan++;
      if (bulan % 12 == 0) {
        biayaHaji = (int) (biayaHaji * (1 + (double) c / 100));
      }
    }
    System.out.println("=".repeat(50));
    System.out.println("Waktu yang dibutuhkan untuk melunasi biaya Haji adalah " + bulan + " bulan");
  }
}
/*
 * Seorang mau menabung untuk pembiayaan ibadah hajinya. Biaya ibadah
 * haji saat ini senilai a juta. Jika tiap bulan dia mampu menabung sebesar b
 * rupiah. Dengan program anda yang menggunakan fungsi, bantulah orang
 * ini untuk menghitung berapa bulan dia butuhkan agar biaya hajinya bisa
 * terpenuhi. Yang menjadikan masalah ini tidak dapat diselesaikan dengan
 * pembagian langsung a/b adalah bahwa setiap tahun biaya haji naik rata-
 * rata c% dari biaya awal (a). Nilai a, b, c dimasukkan oleh user.
 * Contoh hasil
 * masukan berapa biaya awal : 25000000
 * berapa cicilan yang mampu dibayarkan tiap bulan :
 * 500000
 * berapa rata­rata kenaikan tiap tahun (%) : 4
 * waktu yang dibutuhkan untuk melunasi biaya haji
 * adalah 58 bulan
 */