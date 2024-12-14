import java.util.*;
public class TugasPraktikum {
  public static void main (String[] args){
    // Jenis Kendaraan
    int motor = 100000;
    int mobil = 200000;
    
    // Tahun Kendaraan
    int usia_kendaraan_lebih_10tahun = 50000;
    
    // Profil Pengemudi
    int usia_pengemudi_dibawah_25tahun = 100000;
    int memiliki_riwayat_kecelakaan = 150000;
    
    // Total Tarif
    int total_tarif = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukan jenis kendaraan: ");
    String jenis_kendaraan = input.nextLine().toLowerCase();

    System.out.print("Masukan tahun pembuatan kendaraaan: ");
    int tahun_pembuatan_kendaraan = input.nextInt();

    System.out.print("Masukan usia pengemudi: ");
    int usia_pengemudi = input.nextInt();

    input.nextLine();

    System.out.print("Apakah memiliki riwayat Kecelakaan? ya/tidak: ");
    String riwayat_kecelakaan = input.nextLine().toLowerCase();

    System.out.println("");
    System.out.println("===rincian tarif===");

    if (jenis_kendaraan.equals("mobil")) {
      System.out.println("Tarif Dasar: Rp"+mobil);
      total_tarif += mobil;
    } else if (jenis_kendaraan.equals("motor")) {
      System.out.println("Tarif Dasar: Rp" + motor);
      total_tarif += motor;
    };
    
    if (tahun_pembuatan_kendaraan > 10){
      System.out.println("Tambahan Biaya kendaraan tua: Rp"+usia_kendaraan_lebih_10tahun);
      total_tarif += usia_kendaraan_lebih_10tahun;
    }

    if (usia_pengemudi < usia_pengemudi_dibawah_25tahun) {
      System.out.println("Tambahan Biaya usia pengemudi: Rp"+usia_pengemudi_dibawah_25tahun);
      total_tarif += usia_pengemudi_dibawah_25tahun;
    }

    if (riwayat_kecelakaan.equalsIgnoreCase("ya")) {
      System.out.println("Biaya Riwayat kecelakaan: Rp"+memiliki_riwayat_kecelakaan);
      total_tarif += memiliki_riwayat_kecelakaan;
    } 
    System.out.println("total tarif: Rp" + total_tarif);
  }

}
