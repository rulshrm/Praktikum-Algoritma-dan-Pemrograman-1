import java.util.*;
public class TugasPraktikum {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    // Jenis Kendaraan
    final int MOTOR_TARIF = 100000;
    final int MOBIL_TARIF = 200000;
    
    // Tahun Kendaraan
    final int USIA_KENDARAAN_TUA = 50000;

    // Profil Pengemudi
    final int USIA_PENGEMUDI_MUDA = 100000;
    final int RIWAYAT_KECELAKAAN = 150000;
    
    // Total Tarif
    int totalTarif = 0;

    System.out.print("Masukan jenis kendaraan: ");
    String jenisKendaraan = input.nextLine().toLowerCase();

    System.out.print("Masukan tahun pembuatan kendaraaan: ");
    int tahunPembuatanKendaraan = input.nextInt();

    System.out.print("Masukan usia pengemudi: ");
    int usiaPengemudi = input.nextInt();

    input.nextLine();
    System.out.print("Apakah memiliki riwayat Kecelakaan? (ya/tidak): ");
    String riwayatKecelakaan = input.nextLine().toLowerCase();

    System.out.println("\n===rincian tarif===");

    if (jenisKendaraan.equals("mobil")) {
      System.out.println("Tarif Dasar: Rp"+MOBIL_TARIF);
      totalTarif += MOBIL_TARIF;
    } else if (jenisKendaraan.equals("motor")) {
      System.out.println("Tarif Dasar: Rp" + MOTOR_TARIF);
      totalTarif += MOTOR_TARIF;
    }

    if (tahunPembuatanKendaraan < 2014){ // Tahun lebih dari 10 Tahun
      System.out.println("Tambahan Biaya kendaraan tua: Rp"+USIA_KENDARAAN_TUA);
      totalTarif += USIA_KENDARAAN_TUA;
    }

    if (usiaPengemudi < USIA_PENGEMUDI_MUDA) {
      System.out.println("Tambahan Biaya usia pengemudi: Rp"+USIA_PENGEMUDI_MUDA);
      totalTarif += USIA_PENGEMUDI_MUDA;
    }

    if (riwayatKecelakaan.equalsIgnoreCase("ya")) {
      System.out.println("Biaya Riwayat kecelakaan: Rp"+RIWAYAT_KECELAKAAN);
      totalTarif += RIWAYAT_KECELAKAAN;
    } 
    System.out.println("total tarif: Rp" + totalTarif);
  }

}
