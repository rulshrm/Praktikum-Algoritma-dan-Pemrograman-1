package Modul3_Percabangan.Tugas;

import java.util.Scanner;

public class Modul3_2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Deklarasi variabel
    int totalHarga = 0;
    int potongan = 0;
    final int diskonBelanja = 10;
    final int diskonTransaksiPertama = 5;

    // Input total belanja dan nomor transaksi
    System.out.print("Input total belanja: Rp ");
    int totalBelanja = input.nextInt();
    System.out.print("Input nomor transaksi: ");
    int nomorTransaksi = input.nextInt();

    if (totalBelanja > 50000) {
      potongan += (totalBelanja * diskonBelanja/100);
    } 
    if (nomorTransaksi < 50) {
      potongan += (totalBelanja * diskonTransaksiPertama/100);
    } 

    totalHarga = totalBelanja - potongan;
    System.out.println("=".repeat(40));
    System.out.println("Jumlah potongan harga: Rp " + potongan);
    System.out.println("Jumlah yang harus dibayar: Rp " + totalHarga);
    input.close();
  }
}

/*Buatlah sebuah program untuk menentukan diskon belanja buku sebesar
10% apabila total belanja mencapai lebih dari Rp.50.000,- dan
mendapatkan diskon kembali sebesar 5% untuk 50 transaksi pertama
(dilihat dari no.transaksinya), sehingga jumlah yang dibayar adalah total
pembelian dikurangi diskon. Output berupa besarnya potongan dan jumlah
yang harus dibayar. */