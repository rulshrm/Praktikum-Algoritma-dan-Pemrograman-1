package Modul3_Percabangan.Tugas;

import java.util.Scanner;

public class Modul3_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Deklarasi variabel
    int upahKerjaNormal = 5000;
    int upahKerjaLembur = 7500;
    int upahPotonganKerja = 2500;
    int totalGaji = 0;

    // Input jam kerja
    System.out.print("Masukan jam kerja/minggu: ");
    int jamKerja = input.nextInt();

    if (jamKerja >= 50 && jamKerja <= 60) {
      totalGaji = jamKerja * upahKerjaNormal;
    } else if (jamKerja > 60) {
      totalGaji = (60 * upahKerjaNormal) + ((jamKerja - 60) * upahKerjaLembur);
    } else if (jamKerja < 50) {
      totalGaji = (jamKerja * upahKerjaNormal) - ((50 - jamKerja) * upahPotonganKerja);
    }
    System.out.println("Total gaji: Rp " + totalGaji);
  }
}

/*
Buat program untuk menentukan gaji seorang karyawan berdasarkan
waktu/jam kerjanya, dengan aturan bahwa batasan jam kerja normal
adalah 50 sampai 60 jam/minggu dengan upah Rp.5000/jam. Jika lebih
dari batas tersebut, maka kelebihan perjamnya dibayar Rp 7500/jam.
Tetapi jika jam kerjanya kurang dari 50 jam/minggu, maka dikenakan
potongan Rp.2500/jam nya. (Input : jam kerja/minggu, dan output : total
gaji).
 */