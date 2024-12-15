import java.util.*;

public class TugasPraktikum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Tarif Dasar Kendaraan
    final int MOTOR_TARIF = 100000;
    final int MOBIL_TARIF = 200000;

    // Tarif untuk kendaraan tua, usia pengemudi, dan riwayat kecelakaan
    final int USIA_KENDARAAN_TUA = 50000;
    final int USIA_PENGEMUDI_MUDA = 100000;
    final int RIWAYAT_KECELAKAAN = 150000;

    // Total Tarif
    int totalTarif = 0;

    // Input Data
    System.out.print("Masukan jenis kendaraan (mobil/motor): ");
    String jenisKendaraan = input.nextLine().toLowerCase();

    System.out.print("Masukan tahun pembuatan kendaraan: ");
    int tahunPembuatanKendaraan = input.nextInt();

    System.out.print("Masukan usia pengemudi: ");
    int usiaPengemudi = input.nextInt();

    input.nextLine(); // Bersihkan buffer input
    System.out.print("Apakah memiliki riwayat Kecelakaan? (ya/tidak): ");
    String riwayatKecelakaan = input.nextLine().toLowerCase();

    System.out.println("\n=== Rincian Tarif ===");

    // Mengecek jenis kendaraan
    if (jenisKendaraan.equals("mobil")) {
      System.out.println("Tarif Dasar: Rp" + MOBIL_TARIF);
      totalTarif += MOBIL_TARIF;
    } else if (jenisKendaraan.equals("motor")) {
      System.out.println("Tarif Dasar: Rp" + MOTOR_TARIF);
      totalTarif += MOTOR_TARIF;
    }

    // Mengecek kendaraan tua
    if (tahunPembuatanKendaraan < 2014) {
      System.out.println("Tambahan Biaya kendaraan tua: Rp" + USIA_KENDARAAN_TUA);
      totalTarif += USIA_KENDARAAN_TUA;
    }

    // Mengecek usia pengemudi
    if (usiaPengemudi < 25) { // Anggap pengemudi muda kurang dari 25 tahun
      System.out.println("Tambahan Biaya usia pengemudi: Rp" + USIA_PENGEMUDI_MUDA);
      totalTarif += USIA_PENGEMUDI_MUDA;
    }

    // Mengecek riwayat kecelakaan
    if (riwayatKecelakaan.equalsIgnoreCase("ya")) {
      System.out.println("Biaya Riwayat kecelakaan: Rp" + RIWAYAT_KECELAKAAN);
      totalTarif += RIWAYAT_KECELAKAAN;
    }

    // Menampilkan total tarif
    System.out.println("Total tarif: Rp" + totalTarif);

  }
}
